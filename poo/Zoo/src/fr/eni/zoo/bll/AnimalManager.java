package fr.eni.zoo.bll;

import java.util.List;

import fr.eni.zoo.bo.Animal;
import fr.eni.zoo.dal.AnimalDaoMock;

public class AnimalManager {
	AnimalDaoMock animalDao = new AnimalDaoMock();
	public void ajouterAnimal(Animal animal) throws BLLException {
		if (animal == null) {
			throw new BLLException("Animal is null");
		}
		if (animal.getName() == null || animal.getName().isEmpty()) {
			throw new BLLException("Animal name is null or empty");
		}
		if (animal.getTypeanimal() == null) {
			throw new BLLException("Animal type is null");
		}
		animalDao.insert(animal);
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
		return animalDao.findall();
		
}
	public double getProportionaFemelle() {
		int total = animalDao.findall().size();
		int femelleCount = 0;
		for (Animal animal : animalDao.findall()) {
			if (animal.isFemale()) {
				femelleCount++;
			}
		}
		double proportion = (double) femelleCount / total * 100;
		return proportion;
		//System.out.println("Proportion de femelles : " + proportion + "%");
	}
}