package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TabourineTest {

    private Tambourine tambourine;

    @Before
    public void before(){
        tambourine = new Tambourine("plastic", "percussion", 10.00, 15.00, true);
    }

    @Test
    public void hasMaterial(){
        assertEquals("plastic", tambourine.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("percussion", tambourine.getClassification());
    }

    @Test
    public void doesHaveDrumHead(){
        assertTrue(tambourine.hasDrumHead());
    }

    @Test
    public void canPlay(){
        assertEquals("jingle jangle", tambourine.play());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.00, tambourine.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(15.00, tambourine.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.00, tambourine.calculateMarkup(), 0.01);
    }
}
