package arrayProblems;

import java.util.Arrays;

public class pivotIndex {

    public static int pivotIdx(int[] arr) {
        int totalSum = 0;
        for (int num: arr){
            totalSum += num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIdx(nums));
    }
}
