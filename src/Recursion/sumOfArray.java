package Recursion;

public class sumOfArray {
    static int printSum(int[] arr, int idx){

        //base case
        if (idx == arr.length - 1){
            return arr[idx];
        }

        //small problem -> idx+1, end of the array -> sum -> recursive
        int smallAns = printSum(arr, idx + 1);

        //self work
        return arr[idx] + smallAns;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int idx = 0;

        System.out.println(printSum(arr,idx));
    }

}
