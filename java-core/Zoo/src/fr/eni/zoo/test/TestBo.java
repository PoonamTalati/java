package fr.eni.zoo.test;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zoo.bo.Addresse;
import fr.eni.zoo.bo.Animal;
import fr.eni.zoo.bo.Caregiver;
import fr.eni.zoo.bo.Guardian;
import fr.eni.zoo.bo.Salary;
import fr.eni.zoo.bo.TypeAnimal;

public class TestBo {
	public static void main(String[] args) {
		System.out.println("Partie 1 - Tests de la couche métier.");
		
		List<Animal> Animals = List.of(new Animal(1, "Simba", false, TypeAnimal.LION),
				new Animal(2, "Coco", true, TypeAnimal.SINGE), new Animal(3, "Gerald", false, TypeAnimal.GIRAFE),
				new Animal(4, "dumbo", true, TypeAnimal.ELEPHANT));
		System.out.println("Les Animaux");
		for (Animal animal : Animals) {
			System.out.println(animal);
		}

		// partie métier
		Addresse a1 = new Addresse(1, "9", " chemin des bois", "Nantes", "44000");
		Addresse a2 = new Addresse(2, "1", " rue de la forêt", "Rennes", "35000");
		Addresse a3 = new Addresse(3, "2b", " rue Faraday", "Saint Herblain", "44800");

		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);

		Salary s1 = new Caregiver(1, "Dupont", "Daniel", 1800, a1, TypeAnimal.LION);
		Salary s2 = new Caregiver(2, "Martin", "Julie", 1750, a2, TypeAnimal.SINGE);
		Salary s3 = new Guardian(3, "Dubois", "Sophie", 1600, a3, true);
		Salary s4 = new Guardian(4, "Leclerc", "Jacques", 1700, a3, false);

		// Polymorphisme
		List<Salary> tempContacts = new ArrayList<>();
		tempContacts.add(s1);
		tempContacts.add(s2);
		tempContacts.add(s3);
		tempContacts.add(s4);
		System.out.println("Les salariés");
		for (Salary contact : tempContacts) {
			System.out.println(contact);
		}
	}
}


