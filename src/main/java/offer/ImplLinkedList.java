package offer;

public class ImplLinkedList<E>{

    private Node<E> head;

    private Node<E> tail;

    public ImplLinkedList() {
    }

    public void add(E data) {
        if(head == null) {
            head = tail = new Node(data, null);
        }else {
            tail.next = new Node(data, null);
            tail.next = tail;
        }
    }

    public void add(Node<E> node, E data) {
        if(node == null) {
            throw new IllegalArgumentException("node is null");
        }
        node.next = new Node(data, node.next);
    }

    public boolean isEmpty() {
        return head == null;
    }


    public int size() {
        int size = 0;
        Node<E> p = head;
        while(p != null) {
            p = p.next;
            size ++;
        }
        return size;
    }

    public boolean search(E data) {
        Node<E> p = head;
        while(p != null) {
            if(p.data.equals(data)) {
                return true;
            }
        }
        return false;
    }

    class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
