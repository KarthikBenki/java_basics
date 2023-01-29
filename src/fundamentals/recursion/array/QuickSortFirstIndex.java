package fundamentals.recursion.array;

import java.util.Random;

import static fundamentals.array.arraybasics.InputOfArray.printArray;

public class QuickSortFirstIndex {
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

    private static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;

        int pivot = input[startIndex];
        swap(input,startIndex,endIndex);

        int leftPointer = partition(input, startIndex, endIndex, pivot);

        quickSort(input, startIndex, leftPointer - 1);
        quickSort(input, leftPointer + 1, endIndex);
    }

    private static int partition(int[] input, int startIndex, int endIndex, int pivot) {
        int leftPointer = startIndex;
        int rightPointer = endIndex;

        while (leftPointer < rightPointer) {
            while (input[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (input[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;

            swap(input, leftPointer, rightPointer);
        }
        swap(input, leftPointer, endIndex);
        return leftPointer;
    }

    private static void swap(int[] input, int startPoint, int endPoint) {
        int temp = input[startPoint];
        input[startPoint] = input[endPoint];
        input[endPoint] = temp;
    }
}
