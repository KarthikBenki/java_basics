package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;

public class PrintRecursive {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        printRecursive(head);
    }

    private static void printRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;

        System.out.print(head.data+" ");

        printRecursive(head.next);

    }
}
