package instruments;

import behaviours.IPlay;

public class Lute extends Instrument implements IPlay {

    private int numberOfStrings;

    public Lute(String material, String classification, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, classification, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    @Override
    public String play() {
        return "twang";
    }
}