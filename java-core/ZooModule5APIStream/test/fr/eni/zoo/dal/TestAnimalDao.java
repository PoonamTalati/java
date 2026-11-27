package fr.eni.zoo.dal;

import java.util.List;

import fr.eni.zoo.bo.*;

public class TestAnimalDao {

	public static void main(String[] args) {
		// Animaux
		System.out.println("--------------------- Animaux ----------------------");
		Animal lionMale = new Animal(0, "Simba", false, TypeAnimal.LION);
		Animal singeFemelle = new Animal(0, "Coco", true, TypeAnimal.SINGE);
		Animal girafeMale = new Animal(0, "Gerald", false, TypeAnimal.GIRAFE);
		Animal elephantFemelle = new Animal(0, "dumbo", true, TypeAnimal.ELEPHANT);

		Animal animalInconnu = new Animal(100, "INCONNU", false, TypeAnimal.LION);

		AnimalDaoMock animalDao = new AnimalDaoMock();
		// Insertion des 4 animaux
		System.out.println("------------ Insertion des 4 animaux ------------");
		animalDao.insert(lionMale);
		animalDao.insert(singeFemelle);
		animalDao.insert(girafeMale);
		animalDao.insert(elephantFemelle);
		affichageAnimaux(animalDao);

		try {// affichage
				// Moufassa ; Coco ; Gerald ; dumbo
			var nouveauNom = "Moufassa";
			System.out.println(
					"------------ On change le nom de " + lionMale.getName() + " en " + nouveauNom + " ------------");
			affichageAnimaux(animalDao);
			
			lionMale.setName(nouveauNom);
			animalDao.update(lionMale);
			affichageAnimaux(animalDao);
			System.out.println("------------ Mise à jour de l'animal d'id 100 ------------");
			animalDao.update(animalInconnu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}

		try {
			// affichage
			// nom de l'animal d'index 3 : Gerald
			System.out.println("------------ L'animal d'id 3 ------------");
			System.out.println(animalDao.findById(3));
			// Test erreur sur getAnimal d'id 100
			System.out.println("------------ L'animal d'id 100 ------------");
			animalDao.findById(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}

		// affichage
		// Moufassa ; Coco
		try {
			System.out.println("------------ On supprime " + elephantFemelle.getName() + " et " + girafeMale.getName()
					+ " ------------");
			animalDao.delete(elephantFemelle);
			animalDao.delete(girafeMale);
			affichageAnimaux(animalDao);
			System.out.println("------------ On supprime un animal d'id 100 ------------");
			animalDao.delete(animalInconnu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

	// affiche uniquement les animaux
	static void affichageAnimaux(AnimalDaoMock dao) {
		List<Animal> animaux = dao.findall();
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
		System.out.println();
	}
}
