package dsa.linkedlist;

public class LinkedListNode<T> {
   public T data;
   public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public void add(LinkedListNode<T> that) {
        this.next = that;
    }
}
