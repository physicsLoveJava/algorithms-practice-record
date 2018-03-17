package leetcode.Medium;

/**
 * https://leetcode.com/problems/split-linked-list-in-parts/description/
 */
public class SplitLinkedListinParts {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        if(k < 1) {
            return null;
        }
        int len = findLength(root);
        int klen = (int) Math.floor(len / (double)k);
        int rest = len - k * klen;
        ListNode[] rs = new ListNode[k];
        ListNode p = root;
        for (int i = 0; i < k; i++) {
            int tmp = klen;
            if(i < rest) {
                tmp += 1;
            }
            ListNode cur = null;
            while(tmp > 0 && p != null) {
                if(rs[i] == null) {
                    rs[i] = new ListNode(p.val);
                    cur = rs[i];
                }else {
                    cur.next = new ListNode(p.val);
                    cur = cur.next;
                }
                p = p.next;
                tmp --;
            }
        }
        return rs;
    }

    private int findLength(ListNode root) {
        int count = 0;
        ListNode p = root;
        while(p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

}
