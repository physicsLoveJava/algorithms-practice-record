package offer;

import util.adt.LinkNode;

import java.util.Stack;

public class FindTwoLinkedListCommonNode {

    public static Integer find(LinkNode<Integer> list1, LinkNode<Integer> list2) {
        if(list1 == null || list2 == null) {
            return null;
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        add(s1, list1);
        add(s2, list2);
        Integer last = null;
        while(!s1.isEmpty() && !s2.isEmpty()) {
            Integer i = s1.pop();
            Integer j = s2.pop();
            if(i.equals(j)) {
                last = i;
            }else {
                break;
            }
        }
        return last;
    }

    public static Integer find2(LinkNode<Integer> list1, LinkNode<Integer> list2) {
        if(list1 == null || list2 == null) {
            return null;
        }
        int len1 = getLen(list1);
        int len2 = getLen(list2);
        int sp = Math.abs(len1 - len2);
        LinkNode<Integer> p1 = list1;
        LinkNode<Integer> p2 = list2;
        if(len1 > len2) {
            p1 = walk(p1, sp);
        }else {
            p2 = walk(p2, sp);
        }
        while(p1 != null && p2 != null) {
            if(p1.getData().equals(p2.getData())) {
                return p1.getData();
            }
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return null;
    }

    private static LinkNode<Integer> walk(LinkNode<Integer> p1, int sp) {
        while(p1 != null && sp > 0) {
            p1 = p1.getNext();
            sp --;
        }
        return p1;
    }

    private static int getLen(LinkNode<Integer> list1) {
        int len = 0;
        LinkNode<Integer> p = list1;
        while(p != null) {
            p = p.getNext();
            len ++;
        }
        return len;
    }

    private static void add(Stack<Integer> s1, LinkNode<Integer> list1) {
        LinkNode<Integer> p = list1;
        while(p != null) {
            s1.add(p.getData());
            p = p.getNext();
        }
    }

}
