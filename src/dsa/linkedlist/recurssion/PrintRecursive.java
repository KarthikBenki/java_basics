package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;

public class PrintRecursive {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        printRecursive(head);
        System.out.println();
        printReverseRecursive(head);
    }

    private static void printReverseRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        printReverseRecursive(head.next);//call recursion

        System.out.print(head.data+" ");//print first data

    }

    private static void printRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        System.out.print(head.data+" ");//print first data

        printRecursive(head.next);//call recursion

    }
}
