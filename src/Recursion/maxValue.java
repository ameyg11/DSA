package Recursion;

public class maxValue {

    static int printMax(int[] arr, int idx){

        //base case
        if (idx == arr.length - 1){
            return arr[idx];
        }

        //small problem -> idx+1, end of the array -> max -> recursive
        int smallAns = printMax(arr, idx + 1);

        //self work
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,9,5,7};
        int idx = 0;

        System.out.println(printMax(arr,idx));
    }
}
