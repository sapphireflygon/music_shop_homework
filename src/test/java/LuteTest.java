import instruments.Lute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LuteTest {

    private Lute lute;

    @Before
    public void before(){
        lute = new Lute("wood", "plucked string", 86.10, 100.00, 15);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", lute.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("plucked string", lute.getClassification());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(15, lute.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("twang", lute.play());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(86.10, lute.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(100.00, lute.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(13.90, lute.calculateMarkup(), 0.01);
    }
}
