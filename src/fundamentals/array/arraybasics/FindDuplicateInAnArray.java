package fundamentals.array.arraybasics;

public class FindDuplicateInAnArray {
    public static int duplicateNumber(int arr[]) {

        for (int ele1:arr){
            int count  = 0;
            for (int ele2:arr){
                if (ele2==ele1) count++;
            }
            if (count==2) return ele1;
        }

        return 0;
    }
}
