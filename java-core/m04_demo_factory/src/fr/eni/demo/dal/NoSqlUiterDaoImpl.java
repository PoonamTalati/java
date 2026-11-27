package fr.eni.demo.dal;

import fr.eni.demo.bo.User;

public class NoSqlUiterDaoImpl implements UserDao {

	@Override
	public void save(User user) {
        System.out.println(     "[NOSQL] INSERT INTO users (id, name) VALUES (" + user.getId()
                + ", " + user.getNom() + "))");
		
	}

	@Override
	public User getById(int id) {
        System.out.println("[NOSQL] SELECT id, name FROM users WHERE id = " + id);
        
        User user = new  User();    
        user.setId(id);
        user.setNom("Alice");
                return user;
        }
	

}
