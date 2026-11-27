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

		System.out.println("AccountBank  ("+accno+"- Holder"+this.holderTitle +") balance ="+ this.balance+")");
	}
	public String getHolderTitle() {
		return holderTitle;
	}
	public void setHolderTitle(String holderTitle) {
		this.holderTitle = holderTitle;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
}
