package accessories;

public class Strings extends Accessory {

    private int numberInPack;
    private String materials;

    public Strings(double buyingPrice, double sellingPrice, String description, int numberInPack, String materials) {
        super(buyingPrice, sellingPrice, description);
        this.numberInPack = numberInPack;
        this.materials = materials;
    }

    public int getNumberInPack() {
        return this.numberInPack;
    }

    public String getMaterials() {
        return this.materials;
    }
}
