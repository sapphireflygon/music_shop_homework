package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HurdyGurdyTest {

    private HurdyGurdy hurdyGurdy;

    @Before
    public void before(){
        hurdyGurdy = new HurdyGurdy("wood", "bowed string", 350.99, 400.99, 6, "large", true);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", hurdyGurdy.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("bowed string", hurdyGurdy.getClassification());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, hurdyGurdy.getNumberOfStrings());
    }

    @Test
    public void hasWheelSize(){
        assertEquals("large", hurdyGurdy.getWheelSize());
    }

    @Test
    public void doesHaveBuzzingBridge(){
        assertTrue(hurdyGurdy.hasBuzzingBridge());
    }

    @Test
    public void canPlay(){
        assertEquals("hurdygurdy", hurdyGurdy.play());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(350.99, hurdyGurdy.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(400.99, hurdyGurdy.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, hurdyGurdy.calculateMarkup(), 0.01);
    }
}
