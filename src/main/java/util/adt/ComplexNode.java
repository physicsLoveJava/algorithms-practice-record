package util.adt;

public class ComplexNode<T> {

    T data;
    ComplexNode next;
    ComplexNode sibling;

    public ComplexNode(T data) {
        this.data = data;
    }

    public ComplexNode(T data, ComplexNode next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ComplexNode getNext() {
        return next;
    }

    public void setNext(ComplexNode next) {
        this.next = next;
    }

    public ComplexNode getSibling() {
        return sibling;
    }

    public void setSibling(ComplexNode sibling) {
        this.sibling = sibling;
    }

    @Override
    public String toString() {
        return "ComplexNode{" +
                "data=" + data +
                ", next=" + next +
                ", sibling=" + (sibling != null ? sibling.getData() : null) +
                '}';
    }
}
