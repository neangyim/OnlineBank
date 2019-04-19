package co.simplon.entities;

import java.util.Date;

public class Count {
	private int NumCt; // Numero du compte client
	private Date DateCreation; // Date de creation du compte
	private double Balance; // Balance du compte
	private int IdCust; // Numero du Client
	
	public Count(int n, Date d,double b, int c) {
		this.NumCt = n;
		this.DateCreation = d;
		this.Balance= b;
		this.IdCust = c;
	}

	public int getNumCt() {
		return NumCt;
	}

	public void setNumCt(int numCt) {
		NumCt = numCt;
	}

	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int idCust) {
		IdCust = idCust;
	}

	@Override
	public String toString() {
		return "Count [NumCt=" + NumCt + ", DateCreation=" + DateCreation + ", Balance=" + Balance + ", IdCust="
				+ IdCust + "]";
	}

	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAmount(int i) {
		// TODO Auto-generated method stub
		
	}

	
}
