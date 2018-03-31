package leetcode.Medium;

import org.junit.Test;

public class FindEventualSafeStatesTest {
    @Test
    public void eventualSafeNodes() throws Exception {

        int[][] graph = {{},{0,2,3,4},{3},{4},{}};
        System.out.println(new FindEventualSafeStates().eventualSafeNodes(graph));

    }

}