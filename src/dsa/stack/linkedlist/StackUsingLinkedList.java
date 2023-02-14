package dsa.stack.linkedlist;

import dsa.linkedlist.LinkedListNode;

public class StackUsingLinkedList<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    private LinkedListNode<T> prev;

    private int size;

    public StackUsingLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            prev = tail;
        }
        tail = newNode;
        size++;
    }

    public T pop() {
        T popped = tail.data;
        LinkedListNode<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return popped;
    }

    public T top() {
        return tail.data;
    }

}
