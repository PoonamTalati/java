package fr.eni.demo.dal;

import java.util.List;

import fr.eni.demo.bo.Stagiaire;

public interface StagiaireDAO {
	void insert(Stagiaire stagiaire) throws DALException;
	List<Stagiaire> selectAll() throws DALException;
	void update(Stagiaire stagiaire) throws DALException;
	void delete(Stagiaire stagiaire) throws DALException;
}
