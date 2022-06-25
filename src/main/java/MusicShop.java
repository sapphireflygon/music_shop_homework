import accessories.Strings;
import behaviours.ISell;
import instruments.HurdyGurdy;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public MusicShop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<ISell> getStockList() {
        return this.stock;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.removeIf(stockItem -> stockItem == item);
    }
}
