package model.Product;

public class FishingLine extends Product {

    private int lineLength;

    public FishingLine(int productID, String productName, String productCode, int lineLength) {
        super(productID, productName, productCode);
        this.lineLength = lineLength;
    }

    public void fishingLine() {
    }

    public int getLineLength() {
        return lineLength;
    }

    public void setLineLength(int lineLength) {
        this.lineLength = lineLength;
    }
}
