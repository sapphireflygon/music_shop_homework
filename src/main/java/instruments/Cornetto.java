package instruments;

import behaviours.IPlay;

public class Cornetto extends Instrument implements IPlay {

    private String colour;

    public Cornetto(String material, String classification, double buyingPrice, double sellingPrice, String colour) {
        super(material, classification, buyingPrice, sellingPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play() {
        return "doodododooo";
    }
}
