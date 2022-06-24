import instruments.Lute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LuteTest {

    private Lute lute;

    @Before
    public void before(){
        lute = new Lute("wood", "plucked string", 15);
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
}
