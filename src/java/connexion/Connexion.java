package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static String url = "jdbc:mysql://localhost:3306/javaproject";
    private static String user = "root";
    private static String pass = "";
    private static Connection connect;

    public static Connection getInstance(){
        if(connect == null){
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection(url, user, pass);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

}
