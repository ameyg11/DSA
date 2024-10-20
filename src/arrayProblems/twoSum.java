package arrayProblems;

import java.util.Arrays;

class Solution {
    public int[] twoSum1(int[] nums, int target) {
        int pairs=0;
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    int[] arr2={i,j};
//                    pairs++;
                    return arr2;
                }
            }
        }
//        System.out.println(pairs);
        return new int[]{};
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution obj =new Solution();

        int[] arr=obj.twoSum1(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(arr));

    }
}
