package dsa.stack.linkedlist;

import dsa.linkedlist.LinkedListNode;

public class StackUsingLinkedListToLeft<T> {
    private LinkedListNode<T> head;

    private int size;

    public StackUsingLinkedListToLeft() {
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
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public T pop() {
        T popped = head.data;
        head = head.next;
        size--;
        return popped;
    }

    public T top() {
        return head.data;
    }

}
