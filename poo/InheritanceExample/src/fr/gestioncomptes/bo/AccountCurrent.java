package fr.gestioncomptes.bo;

public class AccountCurrent extends AccountBank{
private double overDraft;
private double transactionfees;
public AccountCurrent(String holderTitle, double balance, String accno,double overDraft,double transactionfees) {
	super(holderTitle, balance, accno);
	this.overDraft=overDraft;
	this.transactionfees=transactionfees;
}
public void displayDetails()
{
	super.displayDetails();
	System.out.println("Autorise Overdraft  is:"+this.overDraft);
	System.out.println("Transaction fee is:"+this.transactionfees);
}
}
