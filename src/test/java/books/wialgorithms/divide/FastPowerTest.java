package books.wialgorithms.divide;

import org.junit.Test;

import static org.junit.Assert.*;

public class FastPowerTest {
    @Test
    public void power() throws Exception {
        double delta = 0.01;
        assertEquals(1, FastPower.power(0, 0), delta);
        assertEquals(1, FastPower.power(1, 0), delta);

        assertEquals(1024, FastPower.power(2, 10), delta);
        assertEquals(0.125, FastPower.power(2, -3), delta);
        assertEquals(1e10, FastPower.power(10, 10), delta);

    }

}