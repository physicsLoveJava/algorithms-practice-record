package offer;

import util.adt.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeLevelTraverse {

    public static void levelTraverse(BinaryTreeNode<Integer> node) {
        if(node == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            BinaryTreeNode<Integer> cur = queue.poll();
            print(cur);
            addQueueIfNotNull(queue, cur.getLeft());
            addQueueIfNotNull(queue, cur.getRight());
        }

    }

    private static void addQueueIfNotNull(Queue<BinaryTreeNode<Integer>> queue, BinaryTreeNode<Integer> cur) {
        if(cur != null) {
            queue.add(cur);
        }
    }

    private static void print(BinaryTreeNode<Integer> cur) {
        System.out.print(cur.getData() + ",");
    }

}
