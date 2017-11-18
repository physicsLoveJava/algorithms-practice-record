package util.adt;

public class LinkNode<E> {

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
    public String toString() {
        return "LinkNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
