package fr.eni.zoo.dal;

import java.util.List;

import fr.eni.zoo.bo.*;

public class TestSalarieDao {

	public static void main(String[] args) throws DALException {
		// Animaux
		Animal lionMale = new Animal(0, "Simba", false, TypeAnimal.LION);
		Animal singeFemelle = new Animal(0, "Coco", true, TypeAnimal.SINGE);

		AnimalDaoMock animalDao = new AnimalDaoMock();
		// Insertion des 4 animaux
		animalDao.insert(lionMale);
		animalDao.insert(singeFemelle);

		// création d'adresse
		Addresse a1 = new Addresse(1, "9", " chemin des bois", "Nantes", "44000");
		Addresse a2 = new Addresse(2, "1", " rue de la forêt", "Rennes", "35000");
		Addresse a3 = new Addresse(3, "2b", " rue Faraday", "Saint Herblain", "44800");
		Addresse a4 = new Addresse(4, "1", " rue de la soie", "Quimper", "29000");

		// Salariés
		System.out.println("--------------------- Salariés ----------------------");
		// Création d'exemples de soignants
		Salary s1 = new Caregiver(0, "Dupont", "Daniel", 1800, a1, TypeAnimal.LION);
		Salary s2 = new Caregiver(0, "Martin", "Julie", 1750, a2, TypeAnimal.SINGE);
		Salary s3 = new Guardian(3, "Dubois", "Sophie", 1600, a3, true);
		Salary s4 = new Guardian(4, "Leclerc", "Jacques", 1700, a4, false);

		SalarieDaoMock salarieDao = new SalarieDaoMock();

		// affichage
		// 1;2;3;4;
		System.out.println("------------ Insertion des salariés ------------");
		System.out.print(salarieDao.insert(s1) + ";");
		System.out.print(salarieDao.insert(s2) + ";");
		System.out.print(salarieDao.insert(s3) + ";");
		System.out.println(salarieDao.insert(s4) + ";");

		System.out.println("------------ Affichage des salariés ------------");
		affichageSalaries(salarieDao);

		System.out.println("------------ Recherche d'un salarié par son id = 3 ------------");
		int id = 3;
		salarieDao.findById(id);

		System.out.println("------------ Mise à jour d'un salarié : " + s1 + "  ------------");
		s1.setFirstname("Durant");
		salarieDao.update(s1);
		salarieDao.findById(s1.getId());

		System.out.println("------------ Supprimer un salarié : " + s2 + " ------------");
		salarieDao.delete(s2);
		affichageSalaries(salarieDao);
			
	
	}

	// affiche un salarie
	private static void affichageSalarie(SalarieDaoMock dao, int id) throws DALException {
		Salary salarie = dao.findById(id);
		System.out.println(salarie);
		System.out.println();
	}

	// affiche uniquement tous les salariés
	private static void affichageSalaries(SalarieDaoMock dao) {
		List<Salary> salaries = dao.findall();
		for (Salary sal : salaries) {
			System.out.println(sal);
		}
		System.out.println();
	}
}
