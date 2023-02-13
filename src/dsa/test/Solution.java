package dsa.test;

import dsa.linkedlist.LinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static void replaceDuplicates(LinkedListNode<Integer> head) {
        // map to store the frequency of numbers
        Map<Integer, Integer> mymap = new HashMap<>();

        LinkedListNode<Integer> temp = head;

        // variable to store the maximum number
        // in linked list
        int maxNum = 0;

        // traverse the linked list to store
        // the frequency of every number and
        // find the maximum integer
        while (temp != null) {
            mymap.put(temp.data, (mymap.get(temp.data) ==
                    null ? 0 : mymap.get(temp.data)) + 1);
            if (maxNum < temp.data)
                maxNum = temp.data;
            temp = temp.next;
        }

        // Traverse again the linked list
        while (head != null) {

            // Mark the node with frequency more
            // than 1 so that we can change the
            // 2nd occurrence of that number
            if (mymap.get(head.data) > 1)
                mymap.put(head.data, -1);

                // -1 means number has occurred
                // before change its value
            else if (mymap.get(head.data) == -1)
                head.data = ++maxNum;

            head = head.next;
        }
    }


    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = nextLargeNumberUtil(head);

        // Reverse the modified list
        return reverse(head);
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static LinkedListNode<Integer> nextLargeNumberUtil(LinkedListNode<Integer> head) {
        // res is head node of the resultant list
        LinkedListNode<Integer> res = head;
        LinkedListNode<Integer> temp = null, prev = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;

            // update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            head.data = sum;

            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }

        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = new LinkedListNode<>(carry);

        // return head of the resultant list
        return res;
    }
}
