package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;


public class InsertionSortWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        takeInput(scanner, arr);
        System.out.println("Before sorting....");
        printArray(arr);
        insertionSort(arr);

        System.out.println("After sorting....");
        printArray(arr);

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp,j;
            temp = arr[i];
            j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }


}
