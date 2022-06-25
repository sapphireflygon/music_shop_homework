package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcarinaTest {

    private Ocarina ocarina;

    @Before
    public void before(){
        ocarina = new Ocarina("ceramic", "wind", 18.50, 20.00, 6, "blue", "tenor");
    }

    @Test
    public void hasMaterial(){
        assertEquals("ceramic", ocarina.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("wind", ocarina.getClassification());
    }

    @Test
    public void hasNumberOfHoles(){
        assertEquals(6, ocarina.getNumberOfHoles());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", ocarina.getColour());
    }

    @Test
    public void hasPitch(){
        assertEquals("tenor", ocarina.getPitch());
    }

    @Test
    public void canPlay(){
        assertEquals("doo doo doo", ocarina.play());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(18.50, ocarina.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, ocarina.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.50, ocarina.calculateMarkup(), 0.01);
    }
}
