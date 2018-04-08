package leetcode.Medium;

import util.adt.TreeLinkNode;

/**
 * Problem Url: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
 */
public class PopulatingNextRightPointersInEachNodeIi {

    public void connect(TreeLinkNode root) {
        if(root == null) {
            return;
        }
        TreeLinkNode cur = root;
        TreeLinkNode next = null;
        TreeLinkNode prev = null;
        while(cur != null) {
            while(cur != null) {
                if(cur.left != null) {
                    if(prev == null) {
                        next = cur.left;
                    }else {
                        prev.next = cur.left;
                    }
                    prev = cur.left;
                }
                if(cur.right != null) {
                    if(prev == null) {
                        next = cur.right;
                    }else {
                        prev.next = cur.right;
                    }
                    prev = cur.right;
                }
                cur = cur.next;
            }
            cur = next;
            next = null;
            prev = null;
        }
    }

}
