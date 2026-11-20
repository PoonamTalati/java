package fr.gestioncomptes.ui;

import fr.gestioncomptes.bo.AccountCurrent;
import fr.gestioncomptes.bo.Bank;
import fr.gestioncomptes.bo.SavingAccount;

public class TestIntermediateLevel {
	public static void main(String[] args) {
		try {
			System.out.println("Création de la banque avec 100 comptes");
			Bank maBanque = new Bank(100);

			SavingAccount compteEpargne = new SavingAccount("John Doe",
															5000,
															"12345",
															2.5);
			AccountCurrent compteCourant = new AccountCurrent("Jane Doe",
															3000,
															"67890",
															1000,
															10);

			System.out.println("\tOPERATION : Ouverture compte épargne");
			maBanque.ouvrirCompte(compteEpargne);

			Thread.sleep(1000);

			System.out.println("\tOPERATION : Ouverture compte courant");
			maBanque.ouvrirCompte(compteCourant);

			System.out.println("\tOPERATION : Affichage comptes de la banque");
			maBanque.displayBankDetails();
			System.out.println("_________________________________________________");
			System.out.println();

			System.out.println("\tOPERATION : Créditer compte épargne de 200 euros");
			compteEpargne.crediter(200);

			System.out.println("\tOPERATION : Affichage comptes de la banque");
			maBanque.displayBankDetails();
			System.out.println("_________________________________________________");
			System.out.println();

			System.out.println("\tOPERATION : débiter compte courant de 8000 euros");
			compteCourant.debiter(8000);

			System.out.println("\tOPERATION : débiter compte courant de 4000 euros");
			compteCourant.debiter(4000);

			System.out.println("\tOPERATION : Affichage comptes de la banque");
			maBanque.displayBankDetails();
			System.out.println("_________________________________________________");
			System.out.println();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
}
