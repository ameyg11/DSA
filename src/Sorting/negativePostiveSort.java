/* Given an array of positive and negative integers, segregate them in linear time and
      constant space. The output should print all negative numbers, followed by all positive numbers. */

package Sorting;

public class negativePostiveSort {

    static void displayArr(int[] arr){
        for(int val: arr){
            System.out.print(val +" ");
        }
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sortedArr(int[] arr){
        if(arr.length <= 1) return ;
        int l=0, r=arr.length-1;

        while(l < r){
            if(arr[l] > 0 && arr[r] < 0){
                swap(arr, l, r);
                l++;
                r--;
            }else if(arr[l] < 0){
                l++;
            } else if(arr[r] > 0) {
                r--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};

        displayArr(arr);
        System.out.println("");
        sortedArr(arr);
        displayArr(arr);

    }
}
