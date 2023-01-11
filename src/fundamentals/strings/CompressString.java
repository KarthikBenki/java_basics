package fundamentals.strings;

import java.util.Scanner;

public class CompressString {
    //    public static String getCompressedString(String str) {
//        int arr[] = new int[256];
//        String newString = "";
//        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i)]++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                if (arr[i]> 1) {
//                    newString += (char)i+String.valueOf(arr[i]);
//                    continue;
//                }
//                newString += (char)i;
//            }
//        }
//        return newString;
//    }
    public static String getCompressedString(String str) {
        String res = "";

        for (int i = 1; i < str.length(); i++) {
            int charCount = 1;

            while (i <= str.length() && str.charAt(i) == str.charAt(i - 1)) {
                charCount++;
                i++;
            }
            res += str.charAt(i - 1);
            if (charCount > 1) {
                res += charCount;
            }
            if(i == str.length() - 1) res+=str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String compressedString = getCompressedString(str);
        System.out.println(compressedString);
    }

}
