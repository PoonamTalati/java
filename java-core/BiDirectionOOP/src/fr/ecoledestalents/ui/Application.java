package fr.ecoledestalents.ui;

import fr.ecoledestalents.bo.Classe;
import fr.ecoledestalents.bo.Student;

public class Application {

	public static void main(String[] args) {
		Classe classe = new Classe("CDA-2509", "CDA");
		Student etudiant1 = new Student("Sairien", "Jean", "25FF");
		Student etudiant2 = new Student("Voyante", "Claire", "23FF");
		Student etudiant3 = new Student("Arne", "Luc", "42FF");

		classe.addStudent(etudiant1);
		classe.addStudent(etudiant2);
		classe.addStudent(etudiant3);
		
		System.out.println("-------    classe initiale    -------");
		System.out.println(classe.tracer());
		System.out.println("________________________________________________\n");

		System.out.println("----- Étudiant " + etudiant2.getName() + " est retiré  -----");
		classe.deleteStudent(etudiant2);
		System.out.println("-------     classe finale     -------");
		System.out.println(classe.tracer());
		System.out.println("________________________________________________\n");
		
		System.out.println("- Retirer le premier étudiant via getEtudiants -");
		Student[] copie = classe.getStudentlist();
		copie[0] = null;
		System.out.println("-----     La copie contient     -----");
		for (int i = 0; i < classe.getStudentlist().length; i++) {
			if(copie[i] != null) {
				System.out.println("\t" + copie[i].tracer());
			}
		}
		
		System.out.println("-------     classe finale     -------");
		System.out.println(classe.tracer());
		System.out.println("** La classe n'a pas changée **");
	}
}

