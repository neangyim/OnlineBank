package co.simplon.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.simplon.entities.Count;

public class CountDao extends Dao<Count> {
	@Override
	public Count find(int id) {
		String str = "select * from T_Counts where NumCt=?";
		PreparedStatement ps;
		Count compte = null;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,id);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){
				compte = new Count(resultSet.getInt(1),resultSet.getDate(2),resultSet.getDouble(3),resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return compte;
	}

	@Override
	public boolean create(Count obj) {
		String str = "INSERT INTO T_Counts (NumCt,DateCreation, Balance, IdCust) VALUES (?, ? ,?,? );";
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1, obj.getNumCt());
			ps.setDate(2,(Date) obj.getDateCreation());
			ps.setDouble(3, obj.getBalance());
			ps.setInt(4,obj.getIdCust());
			ps.executeQuery();
			ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public boolean update(Count obj) {		
		String str = " update T_Counts set Balance=? where NumCt=?;";		
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setDate(1,(Date) obj.getDateCreation());
			ps.setDouble(2,obj.getBalance());
			ps.setInt(3,obj.getIdCust());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return ok;
	}

	@Override
	public boolean delete(Count obj) {
		String str = "delete from T_Counts where NumCt=?;";	
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,obj.getNumCt());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}
}
