package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    @Test
    public void power() throws Exception {
        double delta = 0.00001;
        assertEquals(8.0, Power.power(2, 3), delta);
        assertEquals(16.0, Power.power(2, 4), delta);
        assertEquals(0.5, Power.power(2, -1), delta);
        assertEquals(1024.0, Power.power(2, 10), delta);
    }

}