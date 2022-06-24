package instruments;

public abstract class Instrument {

    private String material;
    private String classification;
//    private String tuning;


    public Instrument(String material, String classification) {
        this.material = material;
        this.classification = classification;
    }

    public String getMaterial() {
        return material;
    }

    public String getClassification() {
        return classification;
    }
}
