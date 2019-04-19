package co.simplon.entities;

import java.util.Date;

public class Operation {
	private int NumOp;// Numéro de l'opération
	private double Amount; // Montant de l'opération 
	private int NumCt; // Numero du Client
	
	public Operation(int n, double a, int c) {
		this.NumOp = n;
		this.Amount = a;
		this.NumCt= c;
	}

	public int getNumOp() {
		return NumOp;
	}

	public void setNumOp(int numOp) {
		NumOp = numOp;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public int getNumCt() {
		return NumCt;
	}

	public void setNumCt(int numCt) {
		NumCt = numCt;
	}

	@Override
	public String toString() {
		return "Operation [NumOp=" + NumOp + ", Amount=" + Amount + ", NumCt=" + NumCt + "]";
	}
	

}
