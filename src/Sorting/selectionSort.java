package Sorting;

import java.util.Arrays;

public class selectionSort {

    static int[] sortNewArr(int[] arr){
        int[] ans = new int[arr.length];

//        for(int i=0; i<arr.length; i++){
//            for(int j=0;)
//        }

        return ans;
    }

    static int[] sortInPlace(int[] arr, int minIdx){

        for (int i=0; i<arr.length; i++){
            minIdx = i;
            for(int j=i; j<arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp= arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 1, 3};
        int minIdx = 0;
        System.out.print(Arrays.toString(sortInPlace(arr, minIdx)));
    }
}
