package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;


public class RecursiveNodeUse {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        head = reverseLinkedListRec2(head);
        printRecursive(head);
        System.out.println();
//        printReverseRecursive(head);
    }

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> newNode = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public static LinkedListNode<Integer> reverseLinkedListRec1(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> newNode = reverseLinkedListRec1(head.next);
        LinkedListNode<Integer> tail = newNode;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return newNode;
    }

    public static LinkedListNode<Integer> reverseLinkedListRec2(LinkedListNode<Integer> head) {
        DoubleNode doubleNode = reverseLinkedListRec3(head);
        return doubleNode.head;
    }

    private static DoubleNode reverseLinkedListRec3(LinkedListNode<Integer> head) {
        DoubleNode ans;
        if (head == null || head.next == null) {
            ans = new DoubleNode(head, head);
            return ans;
        }

        DoubleNode smallAns = reverseLinkedListRec3(head.next);

        smallAns.tail.next = head;
        head.next = null;

         ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;

        return  ans;


    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {

        if (head == null && pos == 0) return null;
        if (pos == 0) {
            return head.next;
        }

        if (head != null)
            head.next = deleteNodeRec(head.next, pos - 1);

        return head;
    }

    private static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head, int pos, int data) {

//        if (pos>NodeUse.length(head)) return null;

        if (head == null && pos > 0) return null;

        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
        LinkedListNode<Integer> newHead = insertNode(head.next, pos - 1, data);

        head.next = newHead;
        return head;
    }


    private static void printReverseRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        printReverseRecursive(head.next);//call recursion

        System.out.print(head.data + " ");//print first data

    }

    private static void printRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        System.out.print(head.data + " ");//print first data

        printRecursive(head.next);//call recursion

    }


}

class DoubleNode {
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;

    public DoubleNode() {
    }

    public DoubleNode(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }
}
