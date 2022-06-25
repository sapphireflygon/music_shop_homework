package instruments;

import behaviours.IPlay;

public class Ocarina extends Instrument implements IPlay {

    private int numberOfHoles;
    private String colour;
    private String pitch;

    public Ocarina(String material, String classification, double buyingPrice, double sellingPrice, int numberOfHoles,
                   String colour, String pitch) {
        super(material, classification, buyingPrice, sellingPrice);
        this.numberOfHoles = numberOfHoles;
        this.colour = colour;
        this.pitch = pitch;
    }

    public int getNumberOfHoles() {
        return this.numberOfHoles;
    }

    public String getColour() {
        return this.colour;
    }

    public String getPitch() {
        return this.pitch;
    }

    @Override
    public String play() {
        return "doo doo doo";
    }
}
