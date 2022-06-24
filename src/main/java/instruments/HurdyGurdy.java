package instruments;

public class HurdyGurdy extends Instrument{

    private int numberOfStrings;
    private String wheelSize;
    private boolean hasBuzzingBridge;

    public HurdyGurdy(String material, String classification, int numberOfStrings, String wheelSize,
                      boolean hasBuzzingBridge) {
        super(material, classification);
        this.numberOfStrings = numberOfStrings;
        this.wheelSize = wheelSize;
        this.hasBuzzingBridge = hasBuzzingBridge;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String getWheelSize() {
        return this.wheelSize;
    }

    public boolean hasBuzzingBridge() {
        return this.hasBuzzingBridge;
    }
}
