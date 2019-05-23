package model.Product;

public class Sinker extends Product {
    private double weight;

    public Sinker(int productID, String productName, String productCode, double weight) {
        super(productID, productName, productCode);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
