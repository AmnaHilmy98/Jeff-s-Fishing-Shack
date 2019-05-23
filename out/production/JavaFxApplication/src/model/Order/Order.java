package model.Order;

import model.Product.Product;

import java.util.LinkedList;

public class Order {

    private int orderID;
    private Product[] products;
    private String productName;
    private int quantity;
    private float unitPrice;
    private float subTotal;
    private String customerName;
    private int customerID;
    private CreditCard creditCard;

    public Order(int orderID, Product[] products, String productName, int quantity, float unitPrice, float subTotal, String customerName, int customerID, CreditCard creditCard) {
        this.orderID = orderID;
        this.products = products;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
        this.customerName = customerName;
        this.customerID = customerID;
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = unitPrice * quantity;
    }

    public float calcPrice() {
        return unitPrice * quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
