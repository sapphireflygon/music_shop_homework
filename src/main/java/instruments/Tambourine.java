package instruments;

import behaviours.IPlay;

public class Tambourine extends Instrument implements IPlay {

    private boolean drumHead;

    public Tambourine(String material, String classification, double buyingPrice, double sellingPrice,
                      boolean drumHead) {
        super(material, classification, buyingPrice, sellingPrice);
        this.drumHead = drumHead;
    }

    public boolean hasDrumHead() {
        return this.drumHead;
    }

    @Override
    public String play() {
        return "jingle jangle";
    }
}
