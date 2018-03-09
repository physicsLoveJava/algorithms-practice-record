package types.bt;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratingBinaryStringTest {
    @Test
    public void generate() throws Exception {

        new GeneratingBinaryString().generate(1);
        new GeneratingBinaryString().generate(2);
        new GeneratingBinaryString().generate(3);
        new GeneratingBinaryString().generate(4);
        new GeneratingBinaryString().generate(8);

    }

}