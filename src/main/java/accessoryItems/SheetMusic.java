package accessoryItems;

public class SheetMusic extends Accessory{

    private int numberOfPages;

    public SheetMusic(double buyingPrice, double sellingPrice, String description, int numberOfPages) {
        super(buyingPrice, sellingPrice, description);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }
}
