package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;


public class RecursiveNodeUse {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        head = mergeSort(head);
        printRecursive(head);
//        printReverseRecursive(head);
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) return head;

        LinkedListNode<Integer> midPoint = midPoint(head);
        LinkedListNode<Integer> h1 = head;
        LinkedListNode<Integer> h2 = midPoint.next;
        midPoint.next = null;

        LinkedListNode<Integer> sort_1 = mergeSort(h1);
        LinkedListNode<Integer> sort_2 = mergeSort(h2);

        return mergeTwoSortedLinkedLists(sort_1,sort_2);
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1 == null && head2 == null) return  null;

        LinkedListNode<Integer> head, tail;
        if (head1.data < head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return head;
    }


    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

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

        return ans;


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
