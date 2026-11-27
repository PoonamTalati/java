package fr.gestioncomptes.bo;

public class Bank {
	private int noOfAccount;
	private AccountBank accounts[];

	public Bank(int accountCapacity) {
		this.accounts=new AccountBank[accountCapacity];
		this.noOfAccount = 0;
	}
	public void ouvrirCompte(AccountBank compte) {
		if(noOfAccount<accounts.length)
		{
			this.accounts[noOfAccount]=compte;
			this.noOfAccount++;
		}
		else
		{
			System.out.println("Maximum Account already created.");
		}
	}
	
	public void displayBankDetails()
	{
		for(int i=0;i<this.noOfAccount;i++)
		{
			accounts[i].displayDetails();
		}
	}
}
