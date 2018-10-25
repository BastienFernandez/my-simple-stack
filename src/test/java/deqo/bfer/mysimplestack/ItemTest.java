package deqo.bfer.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item(2);
    }

    @Test
    public void getValue() {
        assertEquals("bug getValue", 2, item.getValue());
    }

    @Test
    public void setValue() {
        item.setValue(3);
        assertEquals("bug setValue", 3, item.getValue());
    }
}