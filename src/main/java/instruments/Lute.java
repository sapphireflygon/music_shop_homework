package instruments;

import behaviours.IPlay;

public class Lute extends Instrument implements IPlay {

    private int numberOfStrings;

    public Lute(String material, String classification, int numberOfStrings) {
        super(material, classification);
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