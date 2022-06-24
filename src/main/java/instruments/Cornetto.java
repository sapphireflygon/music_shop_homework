package instruments;

import behaviours.IPlay;

public class Cornetto extends Instrument implements IPlay {

    private String colour;

    public Cornetto(String material, String classification, String colour) {
        super(material, classification);
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
