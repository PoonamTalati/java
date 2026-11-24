package fr.eni.lambda.testbo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fr.eni.lambda.bo.Person;

public class TestLambda {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jean", "Dupont", LocalDate.of(1989, 11, 23)));
		persons.add(new Person("Marie", "Durand", LocalDate.of(1990, 6, 2)));
		persons.add(new Person("Pierre", "Martin", LocalDate.of(2016, 11, 27)));
		persons.add(new Person("Lucie", "Bernard", LocalDate.of(2024, 4, 24)));
		
		
		System.out.println("-- Liste of Person born after 2015 :");
		persons.stream()
			    .filter(p->p.getBirthDate().getYear()>2015)
			    .sorted(Comparator.comparing(Person::getBirthDate).reversed())
			    .forEach(p->System.out.println(p));
		
		System.out.println("-- Liste of Person Sorted by firstname");
		persons.stream()
			    .filter(p->p.getBirthDate().getYear()>2015)
			    .sorted((p1,p2)->p2.getFirstName().compareTo(p1.getFirstName()))
			    .forEach(p->System.out.println(p));
		
		System.out.println("-- Liste of Person Sorted by firstname");
		persons.stream()
			    .filter(p->p.getBirthDate().getYear()>2015)
			    .sorted((p1,p2)->p2.getFirstName().compareTo(p1.getFirstName()))
			    .forEach(p->System.out.println(p));
		
		System.out.println("-- New List of Person born after 2023 :");
		List<Person> newPersonList = persons.stream()
			    .filter(p->p.getBirthDate().getYear()>2023)
			    .collect(Collectors.toList());
		newPersonList.forEach(p->System.out.println(p));
		
		System.out.println("-- Mapping and finding Maximum or latest year :");
		persons.stream()
		.mapToInt(p->p.getBirthDate().getYear())
		.max()
		.ifPresent(p->System.out.println(p));
		
		System.out.println("-- Mapping and finding details of Older Person:");
		persons.stream()
		.min(Comparator.comparingInt(p->p.getBirthDate().getYear()))
		.ifPresent(p->System.out.println(p));
			   
	}
}
