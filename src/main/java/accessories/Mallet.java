package accessories;

public class Mallet extends Accessory {

    private String material;

    public Mallet(double buyingPrice, double sellingPrice, String description, String material) {
        super(buyingPrice, sellingPrice, description);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
