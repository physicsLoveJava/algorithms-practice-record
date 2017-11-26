package offer;

import util.adt.BinaryTreeNode;

import java.util.Stack;

public class BinaryPathValue {

    public static void printPaths(BinaryTreeNode<Integer> node, int value) {
        if(node == null) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        int curVal = 0;
        bfs(node, value, stack, curVal);
    }

    private static void bfs(BinaryTreeNode<Integer> node, int value, Stack<Integer> stack, int curVal) {
        if(node == null) {
            return;
        }
        stack.push(node.getData());
        curVal += node.getData();
        if(curVal == value) {
            printResult(stack);
        }
        bfs(node.getLeft(), value, stack, curVal);
        bfs(node.getRight(), value, stack, curVal);
        stack.pop();
        curVal -= node.getData();
    }

    private static void printResult(Stack<Integer> stack) {
        StringBuilder sb = new StringBuilder();
        for(Integer item : stack) {
            sb.append(item).append(", ");
        }
        System.out.println(sb.toString());
    }

}
