//In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
//As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
//Example 3: Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2] ----- Output: [4,5]
//Explanation: The numbers 4 and 5 each appear twice in the array.

package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class leetCode_3289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length");
        int len = sc.nextInt();


        int[] nums = new int[len];

        System.out.println("Enter Array Elements");
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int n = nums.length;
        int[] freq = new int[n];
        int[] ans = new int[2];
        int k = 0;
        // int x = 0;

        for (int i=0; i<nums.length; i++){
            freq[nums[i]]++;
            // nums[freq[i]]++;
        }
        for (int i=0; i<freq.length && k<=2; i++){
            if (freq[i] == 2){
                ans[k++] = i;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
