package leetcode.Medium;

import org.junit.Test;

public class NetWorkDelayTimeTest {
    @Test
    public void networkDelayTime() throws Exception {

        System.out.println(new NetWorkDelayTime().networkDelayTime(
                new int[][]{
                        {2, 1, 1},
                        {2, 3, 1},
                        {3, 4, 1}
                },
                4,
                2
        ));

        System.out.println(new NetWorkDelayTime().networkDelayTime(
                new int[][]{
                        {1, 2, 1},
                },
                2,
                2
        ));

    }

}