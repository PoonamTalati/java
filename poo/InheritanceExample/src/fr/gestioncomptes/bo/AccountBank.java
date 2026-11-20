package fr.gestioncomptes.bo;

public class AccountBank {
	private String holderTitle;
	private double balance;
	private String accno;
	public AccountBank(String holderTitle, double balance, String accno) {
		super();
		this.holderTitle = holderTitle;
		this.balance = balance;
		this.accno = accno;
	}
	public void displayDetails()
	{
		System.out.println("Account holder is:"+this.holderTitle+ " having balance of:"+this.balance);
		System.out.println("Account no is:"+this.accno);
	}
	
}
