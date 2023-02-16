package dsa.queue;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {10, 20, 30, 40, 50, 60,70};
        for (int ele : arr) {
            queue.enqueue(ele);
        }

        while (!queue.isEmpty()) {
            try {
                System.out.print(queue.dequeue() + " ");
            } catch (QueueEmptyException e) {

            }
        }
    }
}
