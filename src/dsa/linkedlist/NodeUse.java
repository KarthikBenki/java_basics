package dsa.linkedlist;

import java.util.Scanner;

public class NodeUse {
    public static LinkedListNode<Integer> createLinkedList() {
        LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<>(40);
        n1.add(n2);
        n2.add(n3);
        n3.add(n4);

        return n1;
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput1();
        printLinkedList(head);

        head = skipMdeleteN(head, 2, 3);

        printLinkedList(head);


    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        while(count > 0)
        {
            LinkedListNode<Integer> temp2 = head;
            int tempc =  count - 1;
            while(temp2.next != null && tempc != 0)
            {
                if(temp2.data > temp2.next.data)
                {
                    int tempt = temp2.data;
                    temp2.data = temp2.next.data;
                    temp2.next.data = tempt;
                }
                temp2 = temp2.next;
            }
            count--;
        }
        return head;
    }

    public static LinkedListNode<Integer> bubbleSort1(LinkedListNode<Integer> head )
    {    if(head==null || head.next==null)
        return head;
        //Write your code here
        for(int i=0;i<lengthLL(head)-1;i++){
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> next = curr.next;

            while(curr.next != null){
                if(curr.data > curr.next.data){
                    if(prev == null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }


    private static int lengthLL(LinkedListNode<Integer> head){
        int count = 1;
        while(head.next != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        if (k==0) return head;

        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = kReverse(next, k);
        }


        return prev;


    }

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        //Your code goes here
        LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> t2 = head;
        int i1 = 0;
        int i2 = 0;

        while (i1 < i) {
            t1 = t1.next;
            i1++;
        }

        while (i2 < i) {
            t2 = t2.next;
            i2++;
        }

        swapTwoNodes(t1, t2);

        return head;
    }

    private static void swapTwoNodes(LinkedListNode<Integer> t1, LinkedListNode<Integer> t2) {
        int temp = t1.data;
        t1.data = t2.data;
        t2.data = temp;
    }

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        if (M == 0) {
            return null;
        }

        LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> t2 = head;

        while (t1 != null && t2 != null) {
            int c1 = 1, c2 = 1;

            while (c1 < M && t1 != null) {
                t1 = t1.next;
                c1++;
            }
            if (t1 != null)
                t2 = t1.next;
            while (c2 <= N && t2 != null) {
                t2 = t2.next;
                c2++;
            }
            if (t1 != null)
                t1.next = t2;
            t1 = t2;

        }
        return head;
    }

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> oddHead = null;
        LinkedListNode<Integer> oddTail = null;
        LinkedListNode<Integer> evenHead = null;
        LinkedListNode<Integer> evenTail = null;
        LinkedListNode<Integer> temp = head;


        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            } else {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            }
            temp = temp.next;
        }

        if (oddHead == null) {
            return evenHead;
        }
        if (evenHead == null) {
            return oddHead;
        }
        if (oddHead != null && evenHead != null) {
            oddTail.next = evenHead;
            evenTail.next = null;
            return oddHead;
        }

        return null;
    }

    public static LinkedListNode<Integer> removeDuplicates1(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> curr = head;

        while (curr != null) {
            LinkedListNode<Integer> temp = curr;

            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

    public static LinkedListNode<Integer> removeDuplicates2(LinkedListNode<Integer> head) {
        //Your code goes here

        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> t2 = head.next;


        while (t2 != null) {
            if (t1.data.equals(t2.data)) {
                t2 = t2.next;
            } else {
                t1.next = t2;
                t1 = t2;

            }
        }
        t1.next = null;
        return head;
    }

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        if (head == null || head.next == null) return head;
        LinkedListNode<Integer> temp = head;

        while (temp != null) {

            while (temp.next != null && temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }

            temp = temp.next;
        }

        return head;
    }


    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //12345
        //3
        //34512

        if (head == null || n == 0) return head;

        int count = 0;

        while (count < n) {

            LinkedListNode<Integer> temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next.next = head;
            head = temp.next;
            temp.next = null;

            count++;
        }

        return head;
    }

    public static LinkedListNode<Integer> appendLastNToFirst1(LinkedListNode<Integer> head, int n) {
        //12345
        //3
        //34512

        LinkedListNode<Integer> temp = head;
        int newLength = length(head) - n;

        int index = 0;

        while (index < newLength - 1) {
            temp = temp.next;
            index++;
        }

        LinkedListNode<Integer> newNode = temp.next;

        temp.next = null;
        temp = newNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head = newNode;

        return head;
    }

    public static int findNode(LinkedListNode<Integer> head, int n) {

        if (head == null) return -1;

        if (head.data == n) {
            return 0;
        }

        int index = 0;
        LinkedListNode<Integer> temp = head.next;

        while (temp != null) {
            index++;
            if (temp.data == n) {
                return index;
            }
            temp = temp.next;
        }

        return -1;

    }


    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

        if (pos == 0) {
            head = head.next;
            return head;
        }
        if (pos >= length(head)) return head;//check for last element index and the elements after the last elements

        int index = 0;
        LinkedListNode<Integer> temp = head;
        while (pos > 0 && index != pos - 1) {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, LinkedListNode<Integer> newNode, int pos) {
        if (pos >= length(head)) return head;

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        int index = 0;
        LinkedListNode<Integer> temp = head;

        while (index != pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static void increment(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static LinkedListNode<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        LinkedListNode<Integer> head = null;
        while (data != -1) {
            LinkedListNode<Integer> currentNode = new LinkedListNode<>(data);
            if (head == null) head = currentNode;
            else {
                LinkedListNode<Integer> temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = currentNode;
            }
            data = scanner.nextInt();
        }
        return head;
    }


    public static LinkedListNode<Integer> takeInput1() {
        LinkedListNode<Integer> head = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if (data == -1) return head;
        head = new LinkedListNode<>(data);
        LinkedListNode<Integer> temp = head;
        data = scanner.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            temp.next = newNode;
            temp = temp.next;
            data = scanner.nextInt();
        }
        return head;
    }

    public static int length(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static void printLinkedList(LinkedListNode<Integer> linkedList) {
        LinkedListNode<Integer> temp = linkedList;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
