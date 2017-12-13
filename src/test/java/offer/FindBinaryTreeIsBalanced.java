package offer;

import util.adt.BinaryTreeNode;

public class FindBinaryTreeIsBalanced {

    static class Val{
        int x;

        Val(int x) {
            this.x = x;
        }

        int getX() {
            return x;
        }

        void setX(int x) {
            this.x = x;
        }
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> tree) {
        return isBalancedX(tree, new Val(0));
    }

    private static boolean isBalancedX(BinaryTreeNode<Integer> tree, Val val) {
        if(tree == null) {
            val.setX(0);
            return true;
        }
        Val left = new Val(0);
        Val right = new Val(0);
        if(isBalancedX(tree.getLeft(), left)
                && isBalancedX(tree.getRight(), right)) {
            int diff = left.getX() - right.getX();
            if(Math.abs(diff) <= 1) {
                val.setX(Math.max(left.getX(), right.getX()) + 1);
                return true;
            }
        }
        return false;
    }

}
