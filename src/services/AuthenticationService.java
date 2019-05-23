package services;

import model.User.User;
import database.DBConnection;

import java.sql.*;

public class AuthenticationService {

    private boolean isNonAlphaCharacter = false;
    private int nonAlphaCharacter = 0;

    public void getCustomerReport(User user) {

    }

        // The password must be eight characters or
        // more and must contain at least two
        // non-alphabetic (i.e., not A-Z)

    public User login(User user) {
        DBConnection DBConnection = new DBConnection();
        Connection connection = DBConnection.getConnection();

        try {

            if(user.getEmailAddress().equals("admin")){

                if(user.getPassword().equals("admin")){

                    user.setType("admin");
                    return  user;
                }

                else {

                    return null;
                }

            }
            else if (user.getEmailAddress().contains("@")){

                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM customers WHERE email = '" + user.getEmailAddress() + "' AND password = '" + user.getPassword() + "';";
                ResultSet resultSet = statement.executeQuery(sql);

                if (resultSet.next()) {

                    user.setType("customer");
                    return user;
                } else {
                    return null;
                }

            }
            else {

                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM staff WHERE username  = '" + user.getEmailAddress() + "' AND password = '" + user.getPassword() + "';";
                ResultSet resultSet = statement.executeQuery(sql);

                if (resultSet.next()) {

                    user.setType("staff");
                    return user;

                } else {
                    return null;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isUserLoggedIn(String emailAddress) {
        return true;
    }

    public User register(User user) {
        DBConnection DBConnection1 = new DBConnection();
        Connection connection1 = DBConnection1.getConnection();

        try {
            String sql = "INSERT INTO customers" + " (name, email , password, address)" + " VALUES ('" + user.getName() + "', '" + user.getEmailAddress() + "', '" + user.getPassword() + "', '" + user.getAddress() +"')";
            int minCharForPassword = 8;

            char[] chars = user.getPassword().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (!Character.isLetter(c)) {
                    nonAlphaCharacter++;
                }
            }

            if (nonAlphaCharacter >= 2) {
                isNonAlphaCharacter = true;
            }

            if ((minCharForPassword <= user.getPassword().length()) && (isNonAlphaCharacter)) {
                Statement statement = connection1.createStatement();
                int resultSet = statement.executeUpdate(sql);

                if (resultSet != 0) {
                    return user;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return user;
    }
}
