package lintcode;

import util.TreeUtil.TreeNode;

import static util.TreeUtil.createNode;

public class BaseBinaryTrase {

    public static TreeNode create() {
        TreeNode node1 = createNode(1);
        TreeNode node2 = createNode(2);
        TreeNode node3 = createNode(3);
        node1.right = node2;
        node2.left = node3;
        return node1;
    }

}
