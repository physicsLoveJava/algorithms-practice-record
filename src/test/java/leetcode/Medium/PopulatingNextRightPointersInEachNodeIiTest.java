package leetcode.Medium;

import org.junit.Test;
import util.TreeUtil;
import util.adt.TreeLinkNode;

public class PopulatingNextRightPointersInEachNodeIiTest {
    @Test
    public void connect() throws Exception {
        TreeLinkNode root = TreeUtil.fromListToLinkNode(new Integer[]{
                1, 2, 3, 4, null, null, null, 7
        });
        new PopulatingNextRightPointersInEachNodeIi().connect(root);
        System.out.println(root);
    }

}