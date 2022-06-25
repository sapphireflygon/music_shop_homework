import accessories.SheetMusic;
import accessories.Strings;
import instruments.HurdyGurdy;
import instruments.Lute;
import instruments.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicShopTest {

    private MusicShop musicShop;
    private HurdyGurdy hurdyGurdy;
    private Lute lute;
    private Ocarina ocarina;
    private Strings strings;
    private SheetMusic sheetMusic;

    @Before
    public void before(){
        hurdyGurdy = new HurdyGurdy("wood", "bowed string", 350.99, 400.99, 6, "large", true);
        lute = new Lute("wood", "plucked string", 86.10, 100.00, 15);
        ocarina = new Ocarina("ceramic", "wind", 18.50, 20.00, 6, "blue", "tenor");
        strings = new Strings(6.75, 10.75, "Hurdygurdy strings: 2 drones & 1 melodic", 3, "gut");
        sheetMusic = new SheetMusic(10.00, 13.50, "Glockenspiel for Dummies: 42nd Edition", 69);
        musicShop = new MusicShop("Ye Olde Obscure Instruments", 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ye Olde Obscure Instruments", musicShop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(100.00, musicShop.getTill(), 0.00);
    }

    @Test
    public void canGetTotalNumberOfItemsInStock(){
        assertEquals(0, musicShop.getStockCount());
    }

    @Test
    public void canAddAccessoryToStock(){
        musicShop.addItemToStock(strings);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canAddInstrumentToStock(){
        musicShop.addItemToStock(hurdyGurdy);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canRemoveSpecificItemFromStock(){
        musicShop.addItemToStock(strings);
        musicShop.addItemToStock(hurdyGurdy);
        musicShop.removeItemFromStock(hurdyGurdy);
        assertEquals(1, musicShop.getStockCount());
    }
}
