package fr.gestioncomptes.bo;

import java.time.LocalDateTime;

public class SavingAccount extends AccountBank{
	private double taxInterest;
	private LocalDateTime dateHeureDernierOperation;
	public SavingAccount(String holderTitle, double balance, String accno,double taxInterest) {
		super(holderTitle, balance, accno);
		this.taxInterest=taxInterest;
		this.dateHeureDernierOperation=LocalDateTime.now();
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("\tType of Account : Saving Account");
		System.out.println("\t\tInterest Rate : "+this.taxInterest);
		System.out.println("\t\tDate of last operation : "+this.dateHeureDernierOperation.toString());
	}
	public void crediter(double balance)
	{
		double totalamount=balance+ super.getBalance();
		setBalance(totalamount);
		System.out.println("OPERATION : Credit account savings of "+balance+" euros");
		this.dateHeureDernierOperation=LocalDateTime.now();
	}
	

}
