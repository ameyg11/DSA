package arrayProblems;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        List<Integer>  ans = findNumbers(new int[]{1,2,3,5,6,7});

        System.out.println(ans);
    }

    public static List<Integer> findNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }
}



