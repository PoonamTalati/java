package fr.eni.zoo.bll;

import java.util.List;

import fr.eni.zoo.bo.Animal;
import fr.eni.zoo.dal.AnimalDao;
import fr.eni.zoo.dal.AnimalDaoMock;
import fr.eni.zoo.dal.DALException;
import fr.eni.zoo.dal.DaoFactory;

public class AnimalManager {
	
	private AnimalDao animalDao = DaoFactory.getAnimalDao(); 
	//AnimalDaoMock animalDao = new AnimalDaoMock();
	
	private static AnimalManager instance=null;
	

	
	private AnimalManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static AnimalManager getInstance() {
		if(instance==null) {
			instance=new AnimalManager();
		}
		return instance;
	}
	public int ajouterAnimal(Animal animal) throws BLLException {
		if (animal == null) {
			throw new BLLException("Animal is null");
		}
		if (animal.getName() == null || animal.getName().isEmpty()) {
			throw new BLLException("Animal name is null or empty");
		}
		if (animal.getTypeanimal() == null) {
			throw new BLLException("Animal type is null");
		}
		try {
			animalDao.insert(animal);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animal.getId();
	}
	public void supprimerAnimal(Animal animal) throws BLLException {
		try {
			animalDao.delete(animal);
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
		}
	}
	public void majAnimal(Animal animal) throws BLLException {
		try {
			animalDao.update(animal);
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
		}
	}
	public Animal rechercherAnimal(int id) throws BLLException {
		try {
			return animalDao.findById(id);
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
		}
	}
	public List<Animal> rechercherTousAnimaux() {
		try {
			return animalDao.findall();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
}
	public double getProportionaFemelle() {
		
		try {
			List<Animal> animaux = animalDao.findall();
			long totalFemelles = animaux.stream()
					.filter(animal -> animal.isFemale())
					.count();
			return (double) totalFemelles / animaux.size();
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}
}