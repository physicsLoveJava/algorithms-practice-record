package util;

import util.adt.TreeNode;

import java.util.ArrayDeque;
import java.util.Stack;

public class TreeUtil {

    public static TreeNode createNode(int val) {
        return new TreeNode(val);
    }

    public static util.adt.TreeNode ofTree(Integer val) {
        return new util.adt.TreeNode(val);
    }

    public static util.adt.TreeNode ofTree(Integer val, util.adt.TreeNode left) {
        util.adt.TreeNode node = ofTree(val);
        node.left = left;
        return node;
    }

    public static util.adt.TreeNode ofTree(Integer val, util.adt.TreeNode left, util.adt.TreeNode right) {
        util.adt.TreeNode node = ofTree(val);
        node.left = left;
        node.right = right;
        return node;
    }

    public static TreeNode fromList(Integer[] arr) {
        TreeNode root = ofTree(arr[0]);
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        for (int i = 1; i < arr.length; i++) {
            queue.add(ofTree(arr[i]));
        }
        int level = 1;
        int count = 1;
        while(!queue.isEmpty()) {
            if(Math.pow(2, level) > count) {
                TreeNode[] parentList = new TreeNode[(int) Math.pow(2, level - 1)];
                boolean parentNotNull = false;
                for (int i = 0; i < level && !queue.isEmpty(); i++) {
                    parentList[i] = queue.poll();
                    if(parentList[i] != null) {
                        parentNotNull = true;
                    }
                }
                Stack<TreeNode> childQueue = new Stack<>();
                for (int i = 0; i < level; i++) {
                    TreeNode parent = parentList[i];
                    TreeNode[] child = new TreeNode[2];
                    for (int j = 0; j < 2 && !queue.isEmpty(); j++) {
                        child[j] = queue.poll();
                        childQueue.add(child[j]);
                        count++;
                    }
                    if(parent == null) {
                        continue;
                    }
                    parent.left = child[0];
                    parent.right = child[1];
                }
                while (parentNotNull && !childQueue.isEmpty()) {
                    queue.addFirst(childQueue.pop());
                }
                level++;
            }
        }
        return root;
    }

}
