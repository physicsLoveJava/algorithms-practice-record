package leetcode.Medium;

import org.junit.Test;

public class UniquePathsIiTest {
    @Test
    public void uniquePathsWithObstacles() throws Exception {

        System.out.println(new UniquePathsIi().uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        }));

    }

}