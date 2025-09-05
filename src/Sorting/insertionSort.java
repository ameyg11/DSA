package Sorting;

import java.util.Arrays;

public class insertionSort {

    static int[] sortInPlace(int[] arr, int minIdx){

        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 6, 4, 2};
        int minIdx = 0;
        System.out.print(Arrays.toString(sortInPlace(arr, minIdx)));
    }
}
