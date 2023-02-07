package dsa.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void add(Node<T> that) {
        this.next = that;
    }
}
