package Sorting;
import java.util.*;
public class move0ToEnd {

    static int[] moved0(int[] arr){
        int k=0;  // just to check how many times the array has been iterated
        for(int i=0; i< arr.length; i++){
            boolean flag = false;

            for(int j=i; j<arr.length-i-1; j++){
                if(arr[j]==0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    k++;
                }
                k++;
            }
            System.out.println(k);
            if(!flag) return arr;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,9,0,5,4,0,2,-1};
//        int[] arr = {8,5,7,6,4,0,0,0};
        System.out.print(Arrays.toString(moved0(arr)));
    }
}
