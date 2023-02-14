package dsa.stack.collections;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {

    }

//    public static int[] stockSpan(int[] price) {
//        int span[] = new int[price.length];
//
//        Stack<Integer>  days = new Stack<>();
//
//        days.push(0);
//        span[0] = 1;
//        for (int i = 0; i < price.length; i++) {
//            while (!days.isEmpty() && price[days.peek()]<=price[i]){
//                days.pop();
//            }
//
//            if (!days.isEmpty()){
//                span[i] = i-days.peek();
//            }else {
//                span[i] = 1;
//            }
//            days.push(i);
//
//        }
//        return span;
//     }


    public static int[] stockSpan1(int[] price) {

        /** Base case: when array is empty **/
        if (price.length == 0) {
            return new int[]{0};
        }

        int[] result = new int[price.length];

        /** To hold highest index of stack **/
        Stack<Integer> stack = new Stack<>();

        /** Initial value for index 0, because span for 0th index is always 1 **/
        stack.push(0);
        result[0] = 1;

        /** Iterate all stock from index 1 onward **/
        for (int i = 1; i < price.length; i++) {

            /** Remove all index from stack whose stock value is lesser than current stock **/
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            /** Case 1. When all stock value is smaller than current stock **/
            if (stack.isEmpty()) {
                result[i] = i + 1;
            } else {
                /** Case 2. When there is at-least one previous stock who is higher than current stock **/
                result[i] = (i - stack.peek());
            }

            /** Push current index to stack for further comparision **/
            stack.push(i);
        }
        return result;
    }

    public static int[] stockSpan(int[] price) {
        Stack<Integer> index = new Stack<>();
        int i=0;
        int peek=0;
        int arr[]=new int[price.length];
        while(i<price.length){
            if(index.empty()){
                index.push(i);
                arr[i]=1;
            }else{
                peek=index.peek();
                if(price[peek]>=price[i]){
                    index.push(i);
                    arr[i]=1;
                }else{
                    peek=index.peek();
                    while(price[peek]<price[i]&&((!(index.empty()))&&price[peek]!=price[i])){
                        index.pop();
                        if(!(index.empty())){
                            peek=index.peek();
                        }
                    }
                    if(index.empty()){
                        arr[i]=i+1 ;
                    }
                    else
                    {
                        arr[i]=i-index.peek();
                    }
                    // Push this element to stack
                    index.push(i);
                }
            }
            i++;
        }
        return arr;
    }


}
