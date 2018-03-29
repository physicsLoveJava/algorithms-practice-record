package leetcode.Medium;

import org.junit.Test;
import util.TreeUtil;
import util.adt.TreeNode;

import static util.TreeUtil.ofTree;

public class FindBottomLeftTreeValueTest {
    @Test
    public void findBottomLeftValue() throws Exception {
        TreeNode root = ofTree(2, ofTree(1), ofTree(3));
        System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue2() throws Exception {
        TreeNode root = TreeUtil.fromList(new Integer[] {
                1, 2, 3, 4, null, 5, 6, null, null, 7, null, null, null
        });
        System.out.println(root);
        System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }

}