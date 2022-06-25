package instruments;

import behaviours.IPlay;

public class Glockenspiel extends Instrument implements IPlay {

    public Glockenspiel(String material, String classification, double buyingPrice, double sellingPrice) {
        super(material, classification, buyingPrice, sellingPrice);
    }

    @Override
    public String play() {
        return "ting ting";
    }
}
