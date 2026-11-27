package fr.eni.demo.bll;

import java.util.List;

import fr.eni.demo.bo.Stagiaire;

public interface StagiaireManager {
	public void insert(Stagiaire stagiaire) throws BLLException;
	public List<Stagiaire> selectAll() throws BLLException;
	public void update(Stagiaire stagiaire) throws BLLException;
	public void delete(Stagiaire stagiaire) throws BLLException;
}
