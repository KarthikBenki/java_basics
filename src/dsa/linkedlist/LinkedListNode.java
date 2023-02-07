package dsa.linkedlist;

public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public void add(LinkedListNode<T> that) {
        this.next = that;
    }
}
