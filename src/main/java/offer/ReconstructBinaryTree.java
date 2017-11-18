package offer;

import util.adt.BinaryTreeNode;

import java.util.Arrays;

/**
 * learn how to use idx in array
 */
public class ReconstructBinaryTree {

    public static BinaryTreeNode<Integer> reconstruct(int[] preArr, int[] inArr) {
        if(preArr == null || inArr == null) {
            return null;
        }
        if(preArr.length == 0 || inArr.length == 0) {
            return null;
        }
        return construct(preArr, 0, preArr.length, inArr, 0, inArr.length);
    }

    private static BinaryTreeNode<Integer> construct(int[] preArr, int s1, int e1, int[] inArr, int s2, int e2) {
        if(s1 >= e1 || s2 >= e2) {
            return null;
        }
        int rootVal = preArr[s1];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootVal);
        int idx = find(inArr, s2, e2, rootVal);
        if(idx == -1) {
            throw new IllegalStateException("not a binary tree");
        }
        root.setLeft(construct(preArr, s1 + 1, idx + s1 + 1 - s2, inArr, s2, idx));
        root.setRight(construct(preArr, idx + s1 + 1 - s2, e1, inArr, idx + 1, e2));
        return root;
    }

    private static int find(int[] inArr, int s1, int e1, int rootVal) {
        if(s1 > e1) {
            return -1;
        }
        for (int i = s1; i < e1; i++) {
            if(inArr[i] == rootVal) {
                return i;
            }
        }
        return -1;
    }

}
