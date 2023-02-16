package dsa.queue;

public class QueueUse {
    public static void main(String[] args)  {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {10, 20, 30, 40};
        for (int ele : arr) {
            try {
                queue.enqueue(ele);
            } catch (QueueFullException e) {

            }
        }

        while (!queue.isEmpty()){
            try {
                System.out.print(queue.dequeue()+" ");
            } catch (QueueEmptyException e) {

            }
        }
    }
}
