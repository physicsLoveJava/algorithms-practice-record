package leetcode.Easy;

import org.junit.Test;
import util.adt.TreeNode;

import static util.TreeUtil.ofTree;

public class AverageOfLevelsInBinaryTreeTest {
    @Test
    public void averageOfLevels() throws Exception {

        TreeNode root = ofTree(3,
                ofTree(9),
                ofTree(20,
                        ofTree(15),
                        ofTree(7)));

        System.out.println(new AverageOfLevelsInBinaryTree().averageOfLevels(root));

    }

}