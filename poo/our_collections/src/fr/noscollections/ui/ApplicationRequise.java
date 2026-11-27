package fr.noscollections.ui;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRequise {
	
	public static void main(String[] args) {
		List<String> prenom = new ArrayList<>();
		prenom.add("Jean");
		prenom.add("Marie");
		prenom.add("Pierre");
		prenom.add("Lucie");
		prenom.add("Sophie");
		
		System.out.println("-- Addition of  "+ prenom.size()+"  prépre-name(s) in our collection -- " );
		System.out.println("-- There are "+ prenom.size()+"  prépre-name(s) in our collection -- " );
		System.out.println("-- Removal of the first name :-- " + prenom.remove(0));
		System.out.println("-- There are "+ prenom.size()+"  prépre-name(s) in our collection -- " );
		System.out.println("-- Our Collections -- " );
		for (String p : prenom) {
			System.out.println(" -- "+p);
		}
	}
	
	

	
}
