package leetcode.hard;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergekSortedLists {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public static class ValPair implements Comparable<ValPair>{

        int val;
        int idx;

        public ValPair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        @Override
        public int compareTo(ValPair o) {
            return Integer.valueOf(val).compareTo(o.getVal());
        }
    }

    static int curIdx;

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ValPair> queue = new PriorityQueue<>();
        curIdx = 0;
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            if(list != null) {
                queue.add(new ValPair(list.val, i));
                lists[i] = list.next;
            }
        }
        while(!queue.isEmpty()) {
            ValPair pair = queue.poll();
            curNode.next = new ListNode(pair.getVal());
            curNode = curNode.next;
            ListNode list = lists[pair.getIdx()];
            if(list != null) {
                queue.add(new ValPair(list.val, pair.getIdx()));
                lists[pair.getIdx()] = list.next;
            }
        }
        return head.next;
    }

}
