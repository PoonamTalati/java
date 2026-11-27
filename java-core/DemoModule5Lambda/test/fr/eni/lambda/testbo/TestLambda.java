package fr.eni.lambda.testbo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import fr.eni.lambda.bo.Person;

public class TestLambda {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jean", "Dupont", LocalDate.of(1989, 11, 23)));
		persons.add(new Person("Marie", "Durand", LocalDate.of(1990, 6, 2)));
		persons.add(new Person("Pierre", "Martin", LocalDate.of(2016, 11, 27)));
		persons.add(new Person("Lucie", "Bernard", LocalDate.of(2024, 4, 24)));
		
		System.out.println("Liste des personnes without using Lambda :");
		persons.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		for(Person p:persons) {
			System.out.println(p);
		}
		
		System.out.println("\n\nListe des personnes using Lambda in Descending order :");
		persons.sort((o1,o2)->o2.getFirstName().compareTo(o1.getFirstName()));
		persons.forEach(s->System.out.println(s));
		
		
		System.out.println("\n\nListe des personnes using Lambda in Birthdate order descending:");
		persons.sort((o1,o2)->o2.getBirthDate().compareTo(o1.getBirthDate()));
		persons.forEach(s->System.out.println(s));
	}
}
