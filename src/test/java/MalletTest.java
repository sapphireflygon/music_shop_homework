import accessoryItems.Mallet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MalletTest {

    private Mallet mallet;

    @Before
    public void before(){
        mallet = new Mallet(0.25, 4.00, "For use in playing the glockenspiel", "rubber");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(0.25, mallet.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(4.00, mallet.getSellingPrice(), 0.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("For use in playing the glockenspiel", mallet.getDescription());
    }

    @Test
    public void hasMaterial(){
        assertEquals("rubber", mallet.getMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.75, mallet.calculateMarkup(), 0.01);
    }
}
