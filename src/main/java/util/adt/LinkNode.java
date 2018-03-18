package util.adt;

public class LinkNode<E extends Comparable> {

    E data;

    LinkNode<E> next;

    public LinkNode(E data, LinkNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkNode<E> getNext() {
        return next;
    }

    public void setNext(LinkNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkNode<?> linkNode = (LinkNode<?>) o;

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
