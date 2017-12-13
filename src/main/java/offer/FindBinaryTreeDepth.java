package offer;

import util.adt.BinaryTreeNode;

public class FindBinaryTreeDepth {

    public static int depth(BinaryTreeNode<Integer> tree) {
        if(tree == null) {
            return 0;
        }
        return Math.max(depth(tree.getLeft()), depth(tree.getRight())) + 1;
    }

}
