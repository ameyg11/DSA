package Recursion;

import java.util.*;

public class permutations {

    public static void permu(int[] nums, int idx, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int x : nums) {
                temp.add(x);
            }
            ans.add(temp);
            return;
        }

        for(int i=idx; i<nums.length; i++){
            swap(nums, idx, i);
            permu(nums, idx + 1, ans);
            swap(nums, idx, i);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1,2,3};
        permu(nums, 0, ans);
        System.out.println(ans);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
