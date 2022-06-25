import accessoryItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(10.00, 13.50, "Glockenspiel for Dummies: 42nd Edition", 69);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.00, sheetMusic.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(13.50, sheetMusic.getSellingPrice(), 0.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Glockenspiel for Dummies: 42nd Edition", sheetMusic.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.50, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void hasNumberOfPages(){
        assertEquals(69, sheetMusic.getNumberOfPages());
    }
}
