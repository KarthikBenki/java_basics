package recursion.array;

import java.util.Random;

import static fundamentals.array.arraybasics.InputOfArray.printArray;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        quickSort(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    private static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    public static void quickSort(int[] input, int si, int ei) {

        if (si >= ei) return;

        int pivotIndex = new Random().nextInt(ei - si) + si;
        int pivot = input[pivotIndex];
        swap(input, pivotIndex, ei);

        int leftPointer = partition(input, si, ei, pivot);

        quickSort(input, si, leftPointer - 1);
        quickSort(input, leftPointer + 1, ei);
    }

    private static int partition(int[] input, int si, int ei, int pivot) {
        int leftPointer = si;
        int rightPointer = ei;

        while (leftPointer < rightPointer) {
            while (input[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (input[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;
            swap(input, leftPointer, rightPointer);

        }
        swap(input, leftPointer, ei);
        return leftPointer;
    }

    public static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
