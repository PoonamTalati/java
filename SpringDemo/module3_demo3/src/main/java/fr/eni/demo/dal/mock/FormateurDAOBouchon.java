package fr.eni.demo.dal.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.demo.bo.Formateur;
import fr.eni.demo.dal.FormateurDAO;

//@Repository
public class FormateurDAOBouchon implements FormateurDAO{

	
	private static List<Formateur> lstFormateurs;

    public FormateurDAOBouchon() {
        lstFormateurs = new ArrayList();
        lstFormateurs.add(new Formateur("Baille", "Anne-Lise", "abaille@campus-eni.fr"));
        lstFormateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
        lstFormateurs.add(new Formateur("Trillard", "Julien", "jtrillard@campus-eni.fr"));
    }    
	@Override
	public void create(Formateur formateur) {
		lstFormateurs.add(formateur);
		
	}

	@Override
	public List<Formateur> findAll() {
		 return lstFormateurs;

	}

}
