package fr.eni.zoo.dal;

import java.util.List;

public interface Dao<T> {
	public int insert(T element) throws DALException;
	public void update(T element) throws DALException;
	public void delete(T element) throws DALException;
	public T findById(int id) throws DALException;
	public List<T> findall() throws DALException;
}
