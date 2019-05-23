package model.Product;

public class Product {
    private int productID;
    private String productName;
    private String productCode;

    public Product(int productID, String productName, String productCode) {
        this.productID = productID;
        this.productName = productName;
        this.productCode = productCode;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
