package arrayProblems;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class runningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length");
        int n = sc.nextInt();


        int[] nums = new int[n];

        System.out.println("Enter Array Elements");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        ans[0] = nums[0];
        int runningSum = nums[0];

        for (int i=1; i<n; i++){
            runningSum += nums[i];
            ans[i] = runningSum;
        }

        System.out.println(Arrays.toString(ans));
    }
}
