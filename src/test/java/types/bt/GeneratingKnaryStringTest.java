package types.bt;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratingKnaryStringTest {
    @Test
    public void generate() throws Exception {

        for (int i = 1; i < 3; i++) {
            new GeneratingKnaryString().generate(i, 10);
        }

    }

}