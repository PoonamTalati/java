package fr.eni.demo.bll.impl;

import java.util.List;

import fr.eni.demo.bll.BLLException;
import fr.eni.demo.bll.StagiaireManager;
import fr.eni.demo.bo.Stagiaire;
import fr.eni.demo.dal.DALException;
import fr.eni.demo.dal.StagiaireDAO;
import fr.eni.demo.dal.impl.StagiaireDAOImpl;

public class StagiaireManagerImpl implements StagiaireManager {

	//private StagiaireDAO dao = new StagiaireDAOMock();
	private StagiaireDAO dao = new StagiaireDAOImpl();
	@Override
	public void insert(Stagiaire stagiaire) throws BLLException {
		try
		{
			dao.insert(stagiaire);
		}catch (DALException e)
		{
			throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public List<Stagiaire> selectAll() throws BLLException {
		try
		{
			return dao.selectAll();
		}catch (DALException e)
		{
			throw new BLLException(e.getMessage());
		}
	}

	@Override
	public void update(Stagiaire stagiaire) throws BLLException {
		try
		{
			dao.update(stagiaire);
		}catch (DALException e)
		{
			throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public void delete(Stagiaire stagiaire) throws BLLException {
		try
		{
			dao.delete(stagiaire);
		}catch (DALException e)
		{
			throw new BLLException(e.getMessage());
		}
		
	}

}
