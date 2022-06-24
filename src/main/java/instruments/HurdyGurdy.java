package instruments;

import behaviours.IPlay;

public class HurdyGurdy extends Instrument implements IPlay {

    private int numberOfStrings;
    private String wheelSize;
    private boolean buzzingBridge;

    public HurdyGurdy(String material, String classification, int numberOfStrings, String wheelSize,
                      boolean buzzingBridge) {
        super(material, classification);
        this.numberOfStrings = numberOfStrings;
        this.wheelSize = wheelSize;
        this.buzzingBridge = buzzingBridge;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String getWheelSize() {
        return this.wheelSize;
    }

    public boolean hasBuzzingBridge() {
        return this.buzzingBridge;
    }

    @Override
    public String play() {
        return "hurdygurdy";
    }
}
