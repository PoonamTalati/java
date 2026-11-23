package fr.eni.zoo.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zoo.bo.Animal;
import fr.eni.zoo.bo.TypeAnimal;
import fr.eni.zoo.bll.*;

public class TestAnimalBll {

	public static void main(String[] args){
		// Animaux
		System.out.println("--------------------- Animaux ----------------------");
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Animal(0, "Simba", false, TypeAnimal.LION));
		zoo.add(new Animal(0, "Coco", true, TypeAnimal.SINGE));
		zoo.add(new Animal(0, "Gerald", false, TypeAnimal.GIRAFE));
		zoo.add(new Animal(0, "dumbo", true, TypeAnimal.ELEPHANT));

		AnimalManager animalManager = AnimalManager.getInstance();

		System.out.println("------------ Insertion des 4 animaux ------------");
		for (Animal animal : zoo) {
			try {
				animalManager.ajouterAnimal(animal);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("------------ Affichage des animaux ------------");
		affichageAnimaux(animalManager);
		
		System.out.println("------------ Test insertion d'un animal incorrect ------------");
		Animal animal = new Animal(0, null, false, null);
		try {
			animalManager.ajouterAnimal(animal);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
		}
		
		Animal animalId1 = null;
		Animal animalId100 = null;
		try {
			System.out.println("------------ Affichage de l'animal avec id = 1 ------------");
			int id = 1;
			animalId1 = animalManager.rechercherAnimal(id);
			System.out.println(animalId1);
			System.out.println("------------ Affichage de l'animal avec id = 100 ------------");
			id = 100;
			animalId100 = animalManager.rechercherAnimal(id);
			System.out.println(animalId100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println();
		}

		System.out.println("------------ Mise à jour de l'animal avec id = 1 ------------");
		try {
			int id = 1;
			animalId1 = animalManager.rechercherAnimal(id);
			String nouveauNom = "Moufassa";
			System.out.println("On change le nom de " + animalId1.getName() + " en " + nouveauNom);
			animalId1.setName(nouveauNom);
			animalManager.majAnimal(animalId1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			affichageAnimaux(animalManager);
		}

		System.out.println("------------ Supprimer l'animal mis à jour ------------");
		try {
			int id = 1;
			animalId1 = animalManager.rechercherAnimal(id);
			animalManager.supprimerAnimal(animalId1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			affichageAnimaux(animalManager);
		}
		
		System.out.println("------------ Proportion de femelle ------------");
		double proportionFemelle = animalManager.getProportionaFemelle();
		System.out.println(proportionFemelle);
	}

	// affiche les animaux
	static void affichageAnimaux(AnimalManager animalManager) {
		List<Animal> animals = animalManager.rechercherTousAnimaux();
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
	}
}
