package fr.eni.demo.bll;

import fr.eni.demo.bo.User;
import fr.eni.demo.dal.UserDAOFactory;
import fr.eni.demo.dal.UserDao;

public class UserManager {

    public static void main(String[] args) {
        System.out.println("##### BO #####");
        User user = new User();
        user.setId(1);
        user.setNom("Alice");
        System.out.print("User par défaut : ");
        System.out.println(user);// appel implicitement la méthode toString()

        System.out.println("\n##### DAL #####");
        // Déclaration de UserDao
        UserDao dao;

        System.out.println("Appel de la factory pour utiliser l’instance de SqlUserDaoImpl");
        dao = UserDAOFactory.createInstance(UserDAOFactory.TYPE_SQL);
        dao.save(user);
        User userDB = dao.getById(1);
        System.out.print("User provenant de la DAL : ");
        System.out.println(userDB);

        System.out.println("\n##### DAL #####");
        System.out.println("Appel de la factory pour utiliser l’instance de NoSqlUtilisateurDaoImpl");
        dao = UserDAOFactory.createInstance(UserDAOFactory.TYPE_NO_SQL);
        dao.save(user);
        userDB = dao.getById(1);
        System.out.print("Utilisateur provenant de la DAL : ");
        System.out.println(userDB);
    }
}
