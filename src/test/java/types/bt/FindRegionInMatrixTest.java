package types.bt;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRegionInMatrixTest {
    @Test
    public void findMaxRegion() throws Exception {

        System.out.println(new FindRegionInMatrix().findMaxRegion(
                new int[][]{
                        {1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1},
                        {1, 0, 0, 1, 0},
                }
        ));

    }

}