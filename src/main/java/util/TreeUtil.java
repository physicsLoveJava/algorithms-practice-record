package util;

public class TreeUtil {

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static TreeNode createNode(int val) {
        return new TreeNode(val);
    }

    public static util.adt.TreeNode ofTree(int val) {
        return new util.adt.TreeNode(val);
    }

    public static util.adt.TreeNode ofTree(int val, util.adt.TreeNode left) {
        util.adt.TreeNode node = ofTree(val);
        node.left = left;
        return node;
    }

    public static util.adt.TreeNode ofTree(int val, util.adt.TreeNode left, util.adt.TreeNode right) {
        util.adt.TreeNode node = ofTree(val);
        node.left = left;
        node.right = right;
        return node;
    }

}
