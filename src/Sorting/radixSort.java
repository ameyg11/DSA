package Sorting;

import java.util.*;

public class radixSort {

    static int maxEle(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i=0; i<arr.length; i++){  // make frequency array
            count[(arr[i]/place)%10]++;
        }
        // prefix sum of count array arr[i]= 105  freq[5]++, place=10, freq[0]
        for(int i=1; i< count.length; i++){
            count[i] += count[i-1];
        }
        // find index of each element in the original array nad put it into output array
        for(int i=n-1; i>=0; i--){
            int idx = count[(arr[i]/place)%10] -1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = output[i];
        }

    }

    static void sortRadix(int[] arr){
        int max = maxEle(arr);        // getting maximum element
        // apply counting sort to sort elements based on place value
        for(int place=1; max/place > 0; place*=10){
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 2};
        sortRadix(arr);
//        System.out.println(Arrays.toString(arr));
        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}
