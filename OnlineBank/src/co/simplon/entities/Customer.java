package co.simplon.entities;

public class Customer {
	private int IdCust;
	private String Name;
	private String FirstName;
	
	public Customer(int I, String N, String F) {
		this.IdCust = I;
		this.Name = N;
		this.FirstName = F;
	}

	@Override
	public String toString() {
		return "Customer [I=" + IdCust + ", N=" + Name + ", F=" + FirstName + "]";
	}

	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int idCust) {
		this.IdCust = idCust;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}	
}









