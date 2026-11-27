package fr.eni.zoo.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zoo.bo.Animal;

public class AnimalDaoMock implements AnimalDao {
	private List<Animal> animaux = new ArrayList<>();
	private static int id = 1;
	
	public static int changeId() {
		return id++;
	}
	public int insert(Animal animal) {
		if (animal == null) {
	        return 0; // or throw DALException if preferred
	    }
	    animal.setId(changeId());
	    animaux.add(animal);
	    return animal.getId();
	}
	public List<Animal> findall() {
		return animaux;
	}
	
	public void delete(Animal animal) throws DALException {
		
			if (animal == null) {
				throw new DALException("Animal is null");
			}
			boolean removed = animaux.removeIf(a -> a.getId() == animal.getId());

			if (!removed) {
				throw new DALException("L'animal d'id : " + animal.toString() + " - n'existe pas; impossible de le supprimer");
			}
		
		
	}
	public Animal findById(int id) throws DALException {
		
			for (Animal animal : animaux) {
				if (animal.getId() == id) {
					//System.out.println(animal);
					return animal;
				}
			}
			throw new DALException("L'animal d'id : "+id+" - n'existe pas");
		
		
	}
	
	public void update(Animal animal) throws DALException {
		for (int i = 0; i < animaux.size(); i++) {
			if (animaux.get(i).getId() == animal.getId()) {
				animaux.set(i, animal);
				return; // Exit the method after updating
			}
		}
		throw new DALException("This animal "+animal.toString()+"does not exist, no possible update");
	}
	
}
