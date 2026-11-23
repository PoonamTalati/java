package fr.eni.demo.dal;

public class UserDAOFactory {
    public  static  final  String TYPE_SQL = "SQL" ;
    public  static  final  String TYPE_NO_SQL = "" ;
    public  static UserDao createInstance(String type)  {
            switch  (type)  {
            case TYPE_SQL:
                            return  new  SqlUtilisateurDaoImpl();
            case TYPE_NO_SQL:
                            return  new  NoSqlUiterDaoImpl();
                    default :
                            throw  new  IllegalArgumentException("Unknown DAL type: " + type);
            }
    }
}
