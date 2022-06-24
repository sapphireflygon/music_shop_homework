import instruments.HurdyGurdy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HurdyGurdyTest {

    private HurdyGurdy hurdyGurdy;

    @Before
    public void before(){
        hurdyGurdy = new HurdyGurdy("wood", "bowed string", 6, "large", true);
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

}
