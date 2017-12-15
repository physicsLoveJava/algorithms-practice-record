package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeColorFlagTest {
    @Test
    public void move() throws Exception {

        assertEquals("BWR", ThreeColorFlag.move("RWB"));
        assertEquals("BBWR", ThreeColorFlag.move("RWBB"));
        assertEquals("BBBWR", ThreeColorFlag.move("RWBBB"));
        assertEquals("BBBBWR", ThreeColorFlag.move("RWBBBB"));

        assertEquals("BBBBWWWWR", ThreeColorFlag.move("RWWWWBBBB"));
    }

    @Test
    public void move2() {
        assertEquals("BBBBWWWWRRRR", ThreeColorFlag.move("RRRRWWWWBBBB"));
    }

}