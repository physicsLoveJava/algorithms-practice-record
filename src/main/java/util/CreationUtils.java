package util;

import util.adt.LinkNode;

public class CreationUtils {
    public static LinkNode<Integer> linkedList(int start, int end) {
        if(end < start) {
            return null;
        }
        int gap = end - start;
        LinkNode[] nodes = new LinkNode[gap];
        for (int i = end - 1; i >= start; i--) {
            nodes[i - start] = new LinkNode(i, i == end - 1 ? null : nodes[i - start + 1]);
        }
        return nodes[0];
    }
}
