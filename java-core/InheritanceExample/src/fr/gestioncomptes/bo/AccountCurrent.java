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
	System.out.println("\tType of Account : Current Account");
	System.out.println("\t\tAuthorized Discovery: "+this.overDraft);
	System.out.println("\t\tTransaction fee : "+this.transactionfees);
}
public void debiter(double amt)
{
	
        System.out.println("  OPERATION : debit current account of " + amt + " euros");

        if (amt <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        double newBalance = getBalance() - amt;

       
        if (newBalance < -this.overDraft) {
            System.out.println("Unauthorized operation. Exceedance of the authorized overflow.");
            return;
        }

       
        if (newBalance < 0) {
            newBalance -= this.transactionfees;
            setBalance(newBalance);
            System.out.println("An overdraft is allowed, transaction fees of "
                    + this.transactionfees + " euros have been debited.");
        } else {
            setBalance(newBalance);
        }
}
}
