package model.User;

import database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class User {
    private String name;
    private String emailAddress;
    private String password;
    private String address;
    private String type;

    public String getName() {
        return name;
    }

    private DBConnection DBConnection = new DBConnection();
    private Connection connection = DBConnection.getConnection();

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public User(String name, String email, String password, String address){
        this.name = name;
        this.emailAddress = email;
        this.password = password;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int updateEmailAddress(String newEmailAddress) {
        int rowsAffected = 0;
        try {
            DBConnection DBConnection1 = new DBConnection();
            Connection connection1 = DBConnection1.getConnection();
            //connection1.setAutoCommit(false);
            String sql = "UPDATE customers SET email = ? WHERE email = ?;";

            PreparedStatement preparedStatement = connection1.prepareStatement(sql);

            preparedStatement.setString(1, newEmailAddress);
            preparedStatement.setString(2, this.getEmailAddress());

            rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                //update user object only if update was successful
                this.emailAddress = newEmailAddress;
            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int updatePassword(String newPassword) {
        int rowsAffected = 0;
        try {
            DBConnection DBConnection1 = new DBConnection();
            Connection connection1 = DBConnection1.getConnection();
            //connection1.setAutoCommit(false);
            String sql = "UPDATE customers SET password = ? WHERE email = ?;";

            PreparedStatement preparedStatement = connection1.prepareStatement(sql);

            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, this.getEmailAddress());

            rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                //update user object only if update was successful
                this.password = newPassword;
            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    public String getAddress() {
        return address;
    }
}
