package fr.eni.demo.dal;

import fr.eni.demo.bo.User;

public interface UserDao {
	public void save(User user);
	public User getById(int id);
}
