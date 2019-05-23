package model.User;

import model.Order.Order;

import java.util.Date;

public class Admin extends Customer {
    public Admin(String emailAddress, String password, String customerName, String address) {
        super(emailAddress, password, customerName, address);
    }

    public Order[] viewLog(Date date) {
        return  new Order[1];
    }

}
