import instruments.Cornetto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CornettoTest {

    private Cornetto cornetto;

    @Before
    public void before(){
        cornetto = new Cornetto("wood and ivory", "brass-like wind", "ebony");
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood and ivory", cornetto.getMaterial());
    }

    @Test
    public void hasClassification(){
        assertEquals("brass-like wind", cornetto.getClassification());
    }

    @Test
    public void hasColour(){
        assertEquals("ebony", cornetto.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("doodododooo", cornetto.play());
    }
}
