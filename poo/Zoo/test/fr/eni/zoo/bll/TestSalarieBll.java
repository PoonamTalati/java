package fr.eni.zoo.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zoo.bo.Addresse;
import fr.eni.zoo.bo.Animal;
import fr.eni.zoo.bo.Caregiver;
import fr.eni.zoo.bo.Guardian;
import fr.eni.zoo.bo.Salary;
import fr.eni.zoo.bo.TypeAnimal;
import fr.eni.zoo.bll.*;

public class TestSalarieBll {

	public static void main(String[] args) throws BLLException {
		// Animaux
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Animal(0, "Simba", false, TypeAnimal.LION));
		zoo.add(new Animal(0, "Coco", true, TypeAnimal.SINGE));
		AnimalManager animalManager = new AnimalManager();
		for (Animal animal : zoo) {
			animalManager.ajouterAnimal(animal);
		}

		// création d'adresse
		Addresse a1 = new Addresse(1, "9", " chemin des bois", "Nantes", "44000");
		Addresse a2 = new Addresse(2, "1", " rue de la forêt", "Rennes", "35000");
		Addresse a3 = new Addresse(3, "2b", " rue Faraday", "Saint Herblain", "44800");
		Addresse a4 = new Addresse(4, "1", " rue de la soie", "Quimper", "29000");

		// Salariés
		System.out.println("--------------------- Salariés ----------------------");
		// Création d'exemples de soignants
		List<Salary> salaries = new ArrayList<>();
		salaries.add(new Caregiver(0, "Dupont", "Daniel", 1800, a1, TypeAnimal.LION));
		salaries.add(new Caregiver(0, "Martin", "Julie", 1750, a2, TypeAnimal.SINGE));
		salaries.add(new Guardian(0, "Dubois", "Sophie", 1600, a3, true));
		salaries.add(new Guardian(0, "Leclerc", "Jacques", 1700, a4, false));

		SalarieManager salarieManager = new SalarieManager();
		System.out.println("------------ Insertion des salariés ------------");
		for (Salary salarie : salaries) {
			salarieManager.ajouterSalarie(salarie);
		}

		System.out.println("------------ Affichage des salariés ------------");
		affichageSalaries(salarieManager);
		
		System.out.println("------------ Test insertion d'un salarié incorrect ------------");
		Salary anonyme = new Guardian(0, null, "", 1600, null, false);
		try {
			salarieManager.ajouterSalarie(anonyme);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("------------ Affichage du salarié avec id = 1 ------------");
		int id = 1;
		Salary s = salarieManager.rechercherSalarie(id);
		System.out.println(s);
		System.out.println();
		
		System.out.println("------------ Mise à jour du salarié avec id = 1 ------------");
		s.setFirstname("Durant");
		salarieManager.majSalarie(s);
		affichageSalaries(salarieManager);
		
		System.out.println("------------ Supprimer le salarié avec id = 1 ------------");
		salarieManager.supprimerSalarie(s);
		affichageSalaries(salarieManager);

		System.out.println("--------------------- Masse salariale ----------------------");
		System.out.println(salarieManager.getMasseSalariale());
		System.out.println();
		
		System.out.println("--------------------- Moyenne des salaires ----------------------");
		System.out.println(salarieManager.getMoyenneSalariale());
		System.out.println();
	}

	// affiche uniquement tous les salariés
	private static void affichageSalaries(SalarieManager manager) {
		List<Salary> salaries = manager.rechercherTousSalaries();
		for (Salary sal : salaries) {
			System.out.println(sal);
		}
		System.out.println();
	}
}
