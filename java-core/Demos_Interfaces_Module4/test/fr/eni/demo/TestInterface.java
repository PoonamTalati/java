package fr.eni.demo;

import java.time.LocalDate;

import fr.eni.demo.bll.BLLException;
import fr.eni.demo.bll.StagiaireManager;
import fr.eni.demo.bll.impl.StagiaireManagerImpl;
import fr.eni.demo.bo.Stagiaire;

public class TestInterface {
	public static void main(String[] args) {
	    StagiaireManager manager = new StagiaireManagerImpl();

	    Stagiaire jade = new Stagiaire(1, "Dupond", "jade", LocalDate.of(2005, 2 , 15));
	    Stagiaire julie = new Stagiaire(2, "Martin", "julie", LocalDate.of(2010, 7, 11));
	        
	    try {
	        manager.insert(jade);
	        manager.insert(julie);
	            
	        System.out.println("--- afficher les 2 élements ----");
	        System.out.println(manager.selectAll());
	            
	        jade.setNom("Martin");
	            
	        manager.update(jade);
	            
	        System.out.println("--- mise à jour de jade ----");
	        System.out.println(manager.selectAll());
	            
	        manager.delete(julie);
	            
	        System.out.println("---- destruction de julie ----");
	        System.out.println(manager.selectAll());
	            
	    } catch (BLLException e) {
	        e.printStackTrace();
	    }
	}
}
