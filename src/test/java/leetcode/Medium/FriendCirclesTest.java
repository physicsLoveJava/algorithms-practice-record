package leetcode.Medium;

import org.junit.Test;

public class FriendCirclesTest {
    @Test
    public void findCircleNum() throws Exception {

        System.out.println(new FriendCircles().findCircleNum(
                new int[][]{{
                        1, 1, 0
                }, {
                        1, 1, 1
                }, {
                        0, 1, 1
                }
                }
        ));

        System.out.println(new FriendCircles().findCircleNum(
                new int[][]{
                        {1, 0, 0, 1},
                        {0, 1, 1, 0},
                        {0, 1, 1, 1},
                        {1, 0, 1, 1}
                }
        ));

    }

}