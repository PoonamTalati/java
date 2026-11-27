package fr.noscollections.ui;

import java.util.HashMap;
import java.util.Map;

public class ApplicationIntermediary {
	public static void main(String[] args) {
		Map<String,Double> produits = new HashMap<>();
		produits.put("Pomme", 0.99);
		produits.put("Banane", 1.29);
		produits.put("Orange", 0.79);
		produits.put("Mangue", 1.49);
		produits.put("Fraise", 2.99);
		
		
        String aModifier = "Banane";
        String aSupprimer = "Orange";
		displayProducts(produits);
		
        System.out.println("\n-- Modifier le prix du " + aModifier + " --");
        produits.put(aModifier, 1.1);
      
		
		System.out.println("-- Removal of the product :-- " + produits.remove("Banane"));
		displayProducts(produits);
	}
	public static void displayProducts(Map<String, Double> produits) {
		System.out.println("-- Displaying products --");
		for(String produit : produits.keySet()) {
			System.out.println(produit + " : " + produits.get(produit) + " €");
		}
	}
}
