import instruments.Cornetto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CornettoTest {

    private Cornetto cornetto;

    @Before
    public void before(){
        cornetto = new Cornetto("wood and ivory", "brass", 50.25, 65.25, "ebony");
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood and ivory", cornetto.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("brass", cornetto.getClassification());
    }

    @Test
    public void hasColour(){
        assertEquals("ebony", cornetto.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("doodododooo", cornetto.play());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(50.25, cornetto.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(65.25, cornetto.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(15.00, cornetto.calculateMarkup(), 0.00);
    }
}
