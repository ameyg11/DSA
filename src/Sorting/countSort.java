package Sorting;

import java.util.Arrays;

public class countSort{
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,3,1,3,5};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }
        int[] count = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        System.out.println(max);
        System.out.println(Arrays.toString(count));

        int k=0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
