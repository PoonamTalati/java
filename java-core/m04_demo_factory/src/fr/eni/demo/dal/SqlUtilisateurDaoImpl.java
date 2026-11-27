package fr.eni.demo.dal;

import fr.eni.demo.bo.User;

public class SqlUtilisateurDaoImpl implements UserDao {

	@Override
	public void save(User user) {
        System.out.println(     "[SQL] INSERT INTO users (id, name) VALUES (" + user.getId()
                + ", " + user.getNom() + "))");
		
	}

	@Override
	public User getById(int id) {
        System.out.println("[SQL] SELECT id, name FROM users WHERE id = " + id);
        
        User user = new  User();    
        user.setId(id);
        user.setNom("Alice");
                return user;
        }
	}

	

	


