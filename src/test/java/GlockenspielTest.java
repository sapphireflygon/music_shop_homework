import instruments.Glockenspiel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlockenspielTest {

    private Glockenspiel glockenspiel;

    @Before
    public void before(){
        glockenspiel = new Glockenspiel("steel", "keyboard percussion", 2.00, 5.00);
    }

    @Test
    public void hasMaterial(){
        assertEquals("steel", glockenspiel.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("keyboard percussion", glockenspiel.getClassification());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(2.00, glockenspiel.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(5.00, glockenspiel.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, glockenspiel.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("ting ting", glockenspiel.play());
    }
}
