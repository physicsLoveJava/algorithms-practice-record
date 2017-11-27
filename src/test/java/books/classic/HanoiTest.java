package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiTest {
    @Test
    public void hanoi() throws Exception {
        Hanoi.hanoi(1, "1", "2", "3");
    }

    @Test
    public void hanoi3() throws Exception {
        Hanoi.hanoi(3, "1", "2", "3");
    }

}