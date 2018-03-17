package leetcode.Medium;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/add-two-numbers-ii
 */
public class AddTwoNumbersIi {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1 != null) {
            s1.push(p1.val);
            p1 = p1.next;
        }
        while(p2 != null) {
            s2.push(p2.val);
            p2 = p2.next;
        }

        ListNode rs = null;
        int count = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || count != 0) {
            if(!s1.isEmpty()) {
                count += s1.pop();
            }
            if(!s2.isEmpty()) {
                count += s2.pop();
            }
            if(rs == null) {
                rs = new ListNode(count % 10);
            }else {
                ListNode list = new ListNode(count % 10);
                list.next = rs;
                rs = list;
            }
            count = count / 10;
        }

        if(rs == null) {
            return rs;
        }
        if(rs.val == 0) {
            return rs.next;
        }
        return rs;
    }

}
