package util.adt;

public class ListNode<E extends Comparable> {

    public E data;

    public ListNode<E> next;

    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode<?> linkNode = (ListNode<?>) o;

        if (data != null ? !data.equals(linkNode.data) : linkNode.data != null) return false;
        return next != null ? next.equals(linkNode.next) : linkNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
