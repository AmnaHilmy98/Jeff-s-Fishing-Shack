package model.User;

import model.Order.CreditCard;
import model.Order.Order;
import model.Product.Product;
import services.EmailService;

public class Customer extends User {
    private String customerName;
    private String address;
    private boolean sentNewsletter;
    private CreditCard creditCard;
    private EmailService es = new EmailService();

    public Customer(String emailAddress, String password, String customerName, String address) {
        super(emailAddress, password);
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean sendNewsletter() {
        return sentNewsletter;
    }

    public void setSentNewsletter(boolean sentNewsletter) {
        this.sentNewsletter = sentNewsletter;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void makePayment(Order order) {

        this.es.sendTaxInvoice(order, this.getEmailAddress());
    }

    public void emaiEnquiery(String subject, String enquiryBody) {
        this.es.sendEnquiryEmail(subject, enquiryBody);
    }

    public void signUpForNewsletter(boolean sendNewsLetter)
    {
        this.setSentNewsletter(sendNewsLetter);
    }

}
