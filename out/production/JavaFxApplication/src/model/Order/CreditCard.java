package model.Order;

import java.util.Date;

public class CreditCard {
    private String cardNumber;
    private Date expieryDate;
    private int customerID;

    public CreditCard(String cardNumber, Date expieryDate, int customerID) {
        this.cardNumber = cardNumber;
        this.expieryDate = expieryDate;
        this.customerID = customerID;
    }

    public String getCardNumber() {
        return cardNumber;

    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpieryDate() {
        return expieryDate;
    }

    public void setExpieryDate(Date expieryDate) {
        this.expieryDate = expieryDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
