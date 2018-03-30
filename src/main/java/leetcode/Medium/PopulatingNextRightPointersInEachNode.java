package leetcode.Medium;

import util.adt.TreeLinkNode;

/**
 * Problem Url: https://leetcode.com/problems/populating-next-right-pointers-in-each-node
 */
public class PopulatingNextRightPointersInEachNode {

    public void connect(TreeLinkNode root) {
        if(root == null) {
            return;
        }
        dfs(root.left, root);
        dfs(root.right, root);
    }

    private void dfs(TreeLinkNode node, TreeLinkNode parent) {
        if(node == null) {
            return;
        }
        if(parent.left == node) {
            node.next = parent.right;
        }else {
            if(parent.next != null) {
                node.next = parent.next.left;
            }else {
                node.next = null;
            }
        }
        dfs(node.left, node);
        dfs(node.right, node);
    }

}
