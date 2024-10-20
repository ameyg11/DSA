package arrayProblems;//Rotate the given array 'a' by k steps, where k is non-negative.
//k can be greater than n as well.

import java.util.Arrays;


public class rotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 998;
        int n= arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;

        for (int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }

        for (int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        System.out.println(998%n);
        System.out.println(Arrays.toString(ans));
    }
}
