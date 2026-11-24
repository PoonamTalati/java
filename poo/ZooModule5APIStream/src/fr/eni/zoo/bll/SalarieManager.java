package fr.eni.zoo.bll;

import java.util.List;

import fr.eni.zoo.bo.Salary;
import fr.eni.zoo.dal.DALException;
import fr.eni.zoo.dal.SalarieDaoMock;

public class SalarieManager {
	SalarieDaoMock salarieDao = new SalarieDaoMock();
	private static SalarieManager instance=null;
	
	
	private SalarieManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static SalarieManager getInstance() {
		if (instance==null) {
			instance=new SalarieManager();
		}
		return instance;
	}
	public void ajouterSalarie(Salary salarie) throws BLLException {
		if (salarie == null) {
			throw new BLLException("Salarie is null");
		}
		if (salarie.getFirstname() == null || salarie.getFirstname().isEmpty()) {
			throw new BLLException("Salarie name is null or empty");
		}
		try {
			
			salarieDao.insert(salarie);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}
	public void supprimerSalarie(Salary salarie) throws BLLException {
		try {
			salarieDao.delete(salarie);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}
	public void majSalarie(Salary salarie) throws BLLException {
		try {
			salarieDao.update(salarie);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}
	public Salary rechercherSalarie(int id) throws BLLException {
		try {
			return salarieDao.findById(id);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}
	public List<Salary> rechercherTousSalaries() {

		return salarieDao.findall();
	}
	public double getMasseSalariale() {
		
		return  salarieDao.findall().stream()
				.mapToDouble(Salary::getSalary)
				.sum();
				
		
		/*double masseSalariale = 0;
		for (Salary salarie : salarieDao.findall()) {
			masseSalariale += salarie.getSalary();
		}
		return masseSalariale;*/
	}
	public double getMoyenneSalariale() {
		
		return  salarieDao.findall().stream()
				.mapToDouble(Salary::getSalary)
				.average()
				.orElse(0.0);
				
			
			
	
	}
	
	
}
