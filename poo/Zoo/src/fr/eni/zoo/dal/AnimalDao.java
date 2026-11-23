package fr.eni.zoo.dal;

import java.util.List;

import fr.eni.zoo.bo.Animal;

public interface AnimalDao {
	public int insert(Animal animal) throws DALException;
	public void update(Animal animal) throws DALException;
	public void delete(Animal animal) throws DALException;
	public Animal findById(int id) throws DALException;
	public List<Animal> findall() throws DALException;
	
}
