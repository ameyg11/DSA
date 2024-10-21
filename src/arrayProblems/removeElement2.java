//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.
//Example 1:
//
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).

package arrayProblems;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class removeElement2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Array Length");
        int len = sc.nextInt();


        int[] arr = new int[len];

        System.out.println("Enter Array Elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Value to remove");
        int val = sc.nextInt();

        int j = 0;  // Pointer to keep track of where to place the next non-val element

        // Loop through the array and copy non-val elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;  // Move the pointer to the next position
            }
        }

        // After the loop, 'j' contains the count of elements that are not 'val'
        System.out.println("Number of elements that are not " + val + ": " + j);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, j)));
    }
}
