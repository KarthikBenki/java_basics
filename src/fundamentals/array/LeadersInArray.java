package fundamentals.array;

import java.util.ArrayList;

public class LeadersInArray {

    /*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size) {

        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                leaders.add(arr[i]);
        }

        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{3 ,12, 34, 2 ,0 ,-1};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
