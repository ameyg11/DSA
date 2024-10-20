package arrayProblems;

import java.util.Arrays;

class rotate{
    static void swap(int[] arr,int i,int j){
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}

public class rotateArray2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
    }
}
