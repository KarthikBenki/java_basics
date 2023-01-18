package fundamentals.array.arraybasics;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class TripletSum {

    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int tripletSum(int[] arr, int num) {
        int count = 0;
        int j, k;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            j = i + 1;
            k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == num) {
                    count++;
                    j++;
                    k--;
                }
                else if (arr[i] + arr[j] + arr[k] < num)
                    j++;

                else // arr[i] + arr[l] + arr[r] > num
                    k--;
            }
        }
        return count;
    }

    public static int tripletSum1(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = num - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (s.contains(curr_sum - arr[j])) {
                    count++;
                }
                s.add(arr[j]);
            }
        }
        return count;
    }

    public static int tripletSum2(int[] arr, int num) {

        Arrays.sort(arr);
        int n = arr.length;
        int numTriplets = 0;
        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            int start = i+1;
            int end = n-1;
            while (start<end) {
                if (arr[start]+arr[end]<pairSum) {
                    start++;
                } else if (arr[start]+arr[end]>pairSum) {
                    end--;
                } else {
                    if (arr[start] == arr[end]) {
                        int totalCount = (end - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }

                    int tempI = start + 1;
                    int tempJ = end - 1;

                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }

                    while (tempI <= tempJ && arr[end] == arr[tempJ]) {
                        tempJ--;
                    }

                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = end - tempJ;

                    numPairs += (totalElementFromStart * totalElementFromEnd);

                    start = tempI;
                    end = tempJ;
                }
            } numTriplets += numPairs;
        } return numTriplets;


    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        int x = scanner.nextInt();
//        System.out.println(findTriplet(arr, x));
        System.out.println(tripletSum2(arr, x));
//        System.out.println(tripletSum1(arr, x));
    }
}
