package fundamentals.array;

import java.util.Scanner;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int arr[] = new int[n];


    }

    public static int findUnique(int[] arr){

        for (int ele1:arr){
            int count  = 0;
            for (int ele2:arr){
                if (ele2==ele1) count++;
            }
            if (count==1) return ele1;
        }

        return 0;
    }
}
