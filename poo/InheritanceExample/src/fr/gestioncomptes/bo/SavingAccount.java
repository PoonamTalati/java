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
		System.out.println("Tax interest rate is:"+this.taxInterest);
		System.out.println("dateHeureDernierOperation is:"+this.dateHeureDernierOperation.toString());
	}
	

}
