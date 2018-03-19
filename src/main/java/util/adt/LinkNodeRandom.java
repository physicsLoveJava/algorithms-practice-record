package util.adt;

public class LinkNodeRandom<E extends Comparable> {

    E data;

    LinkNodeRandom<E> next;

    LinkNodeRandom<E> random;

    public LinkNodeRandom(E data) {
        this.data = data;
    }

    public LinkNodeRandom(E data, LinkNodeRandom<E> next) {
        this.data = data;
        this.next = next;
    }

    public LinkNodeRandom(E data, LinkNodeRandom<E> next, LinkNodeRandom<E> random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkNodeRandom<E> getNext() {
        return next;
    }

    public void setNext(LinkNodeRandom<E> next) {
        this.next = next;
    }

    public LinkNodeRandom<E> getRandom() {
        return random;
    }

    public void setRandom(LinkNodeRandom<E> random) {
        this.random = random;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkNodeRandom<?> linkNode = (LinkNodeRandom<?>) o;

        if (data != null ? !data.equals(linkNode.data) : linkNode.data != null) return false;
        return next != null ? next.equals(linkNode.next) : linkNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (random != null ? random.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LinkNodeRandom{" +
                "val=" + data +
                ", next=" + next +
                ", random=" + (random == null ? "null" : random.getData()) +
                '}';
    }
}
