package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree
 */
public class ConvertSortedListToBinarySearchTree {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNodeX{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode fast = head, slow = head;
        ListNode prev = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        TreeNode tree = new TreeNode(slow.val);
        tree.right = sortedListToBST(slow.next);
        prev.next = null;
        tree.left = sortedListToBST(head);
        return tree;
    }

}
