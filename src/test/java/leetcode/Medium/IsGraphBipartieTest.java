package leetcode.Medium;

import org.junit.Test;

public class IsGraphBipartieTest {
    @Test
    public void isBipartite() throws Exception {

        int[][] g = {{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
        System.out.println(new IsGraphBipartie().isBipartite(g));

    }

}