package Sorting;

import java.util.Arrays;

public class countSort2 {

    static void displayArr(int[] arr){
        for(int num: arr){
            System.out.print(num +" ");
        }
    }

    static int[] sortedArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }
        int[] count = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }

        int[] output = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};

        int[] ans = sortedArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
