import instruments.Tambourine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TabourineTest {

    private Tambourine tambourine;

    @Before
    public void before(){
        tambourine = new Tambourine("plastic", "percussion", true);
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
}
