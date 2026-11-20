package fr.gestioncomptes.ui;

import fr.gestioncomptes.bo.AccountBank;
import fr.gestioncomptes.bo.AccountCurrent;
import fr.gestioncomptes.bo.SavingAccount;

public class Application {
	public static void main(String[] args) {
		System.out.println("_________________________________________________");
		System.out.println("OPERATION : Affichage comptes de la banque");
		AccountBank compteEpargne = new SavingAccount("John Doe", 5000, "12345", 2.5);
		compteEpargne.displayDetails();
		AccountBank compteCourant = new AccountCurrent(	"Jane Doe",
															3000,
															"67890",
															1000,
															10);
		compteCourant.displayDetails();
	}
}
