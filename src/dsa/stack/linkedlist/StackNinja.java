package dsa.stack.linkedlist;

import dsa.linkedlist.Node;

public class StackNinja {
    private Node head;

    private int size;


    public StackNinja() {
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int popped = head.data;
        head = head.next;
        size--;
        return popped;
    }

    public int top() {
        if (head == null) return -1;
        return head.data;
    }
}
