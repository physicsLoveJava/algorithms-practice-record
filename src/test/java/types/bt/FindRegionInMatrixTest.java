package types.bt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRegionInMatrixTest {
    @Test
    public void findMaxRegion() throws Exception {

        Assert.assertEquals(6, new FindRegionInMatrix().findMaxRegion(
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