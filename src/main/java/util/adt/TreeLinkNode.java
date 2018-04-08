package util.adt;

public class TreeLinkNode {

    public Integer val;

    public TreeLinkNode left, right, next;

    public TreeLinkNode(Integer x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeLinkNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                ", next=" + next +
                '}';
    }
}
