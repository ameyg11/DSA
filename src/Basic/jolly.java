package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class jolly {

    static boolean jollys(int[] arr, int n){

        if (n == 1) return true;

        int[] nums = new int[n-1];

        for(int i=1; i<arr.length; i++){
            nums[i-1] = arr[i] - arr[i-1];
//            System.out.println(nums[i]);
        }

        for (int j = 1; j < nums.length; j++){
            if (!(nums[j] - nums[j-1] == 0)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter element "+ i +":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is :"+Arrays.toString(arr));

        boolean ans = jollys(arr, n);
        System.out.println(ans);
    }
}
