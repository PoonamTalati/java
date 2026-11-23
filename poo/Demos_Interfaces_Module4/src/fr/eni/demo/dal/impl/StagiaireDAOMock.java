package fr.eni.demo.dal.impl;

import java.util.ArrayList;
import java.util.List;

import fr.eni.demo.bo.Stagiaire;
import fr.eni.demo.dal.StagiaireDAO;

public class StagiaireDAOMock implements StagiaireDAO {
	private static List<Stagiaire> stagiaires = new ArrayList<>();    
	private static long idIndex = 1;
	
	public void insert(Stagiaire stagiaire) {
		stagiaire.setId(idIndex);
		idIndex++;
		stagiaires.add(stagiaire);
	}
	public List<Stagiaire> selectAll() {
		return stagiaires;
	}
	public void update(Stagiaire stagiaire) {
		for (int i = 0; i < stagiaires.size(); i++) {
			if (stagiaires.get(i).getId() == stagiaire.getId()) {
				stagiaires.set(i, stagiaire);
				break;
			}
		}
	}
	public void delete(Stagiaire stagiaire) {
		stagiaires.remove(stagiaire);
	}
}
