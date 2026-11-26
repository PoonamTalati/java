package fr.eni.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bo.Formateur;

@Component
public class FormateurController{
   /* @Autowired
    private FormateurService formateurService;*/

	private FormateurService formateurService;
    public void afficherFormateurs() {
        List<Formateur> lstFormateurs = formateurService.getFormateurs();
        for(Formateur f:lstFormateurs)
        	System.out.println(f);   
    }
	@Autowired
	public void setFormateurService(FormateurService formateurService) {
		System.out.println("Calling setFormateurService Method");
		this.formateurService = formateurService;
	}
	
    
}