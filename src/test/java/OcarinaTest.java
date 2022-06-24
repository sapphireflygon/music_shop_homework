import instruments.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OcarinaTest {

    private Ocarina ocarina;

    @Before
    public void before(){
        ocarina = new Ocarina("ceramic", "wind", 6, "blue", "tenor");
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
}
