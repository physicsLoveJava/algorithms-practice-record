package util;

import util.adt.TreeLinkNode;
import util.adt.TreeNode;

import java.util.ArrayDeque;

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
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int len = arr.length;
        int h = findHeight(len);
        for (Integer nv : arr) {
            queue.add(ofTree(nv));
        }
        ArrayDeque<TreeNode> parent = new ArrayDeque<>();
        TreeNode root = queue.poll();
        parent.add(root);
        for (int j = 0; j < h; j++) {
            int amount = (int) Math.pow(2, j + 1);
            ArrayDeque<TreeNode> level = new ArrayDeque<>();
            while(amount-- > 0 && !queue.isEmpty()) {
                level.add(queue.poll());
            }
            for (int i = 0; i < j + 1; i++) {
                TreeNode parentNode = parent.poll();
                for (int k = 0; k < 2 && !level.isEmpty(); k++) {
                    TreeNode node = level.poll();
                    if(k == 0) {
                        parentNode.left = node;
                    }else {
                        parentNode.right = node;
                    }
                    parent.add(node);
                }
            }
        }
        return root;
    }

    public static TreeLinkNode fromListToLinkNode(Integer[] arr) {
        ArrayDeque<TreeLinkNode> queue = new ArrayDeque<>();
        int len = arr.length;
        int h = findHeight(len);
        for (Integer nv : arr) {
            queue.add(new TreeLinkNode(nv));
        }
        ArrayDeque<TreeLinkNode> parent = new ArrayDeque<>();
        TreeLinkNode root = queue.poll();
        parent.add(root);
        for (int j = 0; j < h; j++) {
            int amount = (int) Math.pow(2, j + 1);
            ArrayDeque<TreeLinkNode> level = new ArrayDeque<>();
            while(amount-- > 0 && !queue.isEmpty()) {
                level.add(queue.poll());
            }
            for (int i = 0; i < j + 1; i++) {
                TreeLinkNode parentNode = parent.poll();
                for (int k = 0; k < 2 && !level.isEmpty(); k++) {
                    TreeLinkNode node = level.poll();
                    if(k == 0) {
                        parentNode.left = node;
                    }else {
                        parentNode.right = node;
                    }
                    parent.add(node);
                }
            }
        }
        return root;
    }

    private static int findHeight(int len) {
        for (int i = 0; ; i++) {
            if(Math.pow(2, i) > len) {
                return i;
            }
        }
    }

}
