package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public Connection connection;
    public Connection getConnection(){
        String dbName = "users";
        String name = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, name, password);


        }

        catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}