package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(double buyingPrice, double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
