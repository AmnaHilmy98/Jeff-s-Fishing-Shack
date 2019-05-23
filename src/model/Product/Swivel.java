package model.Product;

public class Swivel extends Product {
    private String size;

    public Swivel(int productID, String productName, String productCode, String size) {
        super(productID, productName, productCode);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
