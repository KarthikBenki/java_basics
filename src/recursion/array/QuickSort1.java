package recursion.array;

import java.util.Random;

import static fundamentals.array.arraybasics.InputOfArray.printArray;

public class QuickSort1 {
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

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;

        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);

    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int leftPointer = startIndex;
        int rightPointer = endIndex;
        int pivot = array[rightPointer];
        while (leftPointer<rightPointer){
            while (array[leftPointer]<=pivot && leftPointer<rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer --;
            }

            swap(array,leftPointer,rightPointer);
        }

        swap(array,endIndex,leftPointer);
        return leftPointer;
    }

    private static void swap(int[] array, int startIndex, int endIndex) {
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
    }
}
