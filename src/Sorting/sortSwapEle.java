/* Given an array where all its elements are sorted in increasing order except two
        swapped elements, sort it in linear time. Assume there are no duplicates in the array.*/

package Sorting;

public class sortSwapEle {

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sortArr(int[] arr){
        if(arr.length <= 1) return;

        int x = -1;
        int y = -1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }else{
                    y = i;
                }
            }
        }
        swap(arr, x, y);
    }

    public static void main(String[] args){
        int[] arr = {1, 8, 4, 5 ,7, 3, 9};
//        int[] arr = {2, 1};
//        int[] arr = {1, 8, 4, 5 ,7, 3};
//        int[] arr = {1};

        sortArr(arr);

        for (int val: arr){
            System.out.print(val + " ");
        }
    }
}
