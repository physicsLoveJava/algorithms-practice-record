package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionProblemTest {
    @Test
    public void partition() throws Exception {

        assertEquals(3, new PartitionProblem().partition(
                new int[]{
                        1, 1, 1, 1, 1, 1, 1, 1, 1
                },
                3
        ));

        assertEquals(17, new PartitionProblem().partition(
                new int[]{
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                3
        ));

    }

}