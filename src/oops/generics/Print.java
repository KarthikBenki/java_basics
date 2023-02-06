package oops.generics;

public class Print {

    public static <T>void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
       printArray(arr);

        Double dArr[] = {1.14, 2.22, 3.35, 5.46, 9.15};
        printArray(dArr);

        String sArr[] = {"ab","bc","cd","de","ef"};
        printArray(sArr);

        Pair<Integer>[] pArr = new Pair[5];
        for (int i = 0; i < pArr.length; i++) {
            pArr[i] = new Pair<>(10+i,20+i);
        }
        printArray(pArr);
    }
}
