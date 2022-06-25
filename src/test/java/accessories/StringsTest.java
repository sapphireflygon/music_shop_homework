package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    private Strings strings;

    @Before
    public void before(){
        strings = new Strings(6.75, 10.75, "Hurdygurdy strings: 2 drones & 1 melodic", 3, "gut");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(6.75, strings.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.75, strings.getSellingPrice(), 0.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Hurdygurdy strings: 2 drones & 1 melodic", strings.getDescription());
    }

    @Test
    public void hasNumberOfStringsInPack(){
        assertEquals(3, strings.getNumberInPack());
    }

    @Test
    public void hasStringMaterials(){
        assertEquals("gut", strings.getMaterials());
    }

    @Test
    public void canCalcuolateMarkup(){
        assertEquals(4.00, strings.calculateMarkup(), 0.01);
    }
}
