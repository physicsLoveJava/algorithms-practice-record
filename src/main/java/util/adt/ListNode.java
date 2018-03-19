package util.adt;

public class ListNode {

    public Integer val;

    public ListNode next;

    public ListNode(Integer val) {
        this.val = val;
    }

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode linkNode = (ListNode) o;

        if (val != null ? !val.equals(linkNode.val) : linkNode.val != null) return false;
        return next != null ? next.equals(linkNode.next) : linkNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = val != null ? val.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
