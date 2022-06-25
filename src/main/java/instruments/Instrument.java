package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private String classification;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument (String material, String classification, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.classification = classification;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getClassification() {
        return this.classification;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
