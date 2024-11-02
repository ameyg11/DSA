package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfRectangle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {3, 7, 1, 9},
                {2, 4, 6, 8},
                {5, 0, 3, 4},
                {1, 6, 2, 7}
        };

        System.out.println("Your array is"+Arrays.toString(arr));

        System.out.println("Enter l1");
        int l1 = sc.nextInt();
        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter l2");
        int l2 = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();

        int sum = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr[0].length; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

//        System.out.println(Arrays.toString(arr));

        for (int i=l1; i<= l2; i++){
            //r1 to r2 sum for row i
            if (r1 >= 1)
                sum += arr[i][r2] - arr[i][r1-1];
            else
                sum += arr[i][r2];
        }

        System.out.println(sum);
    }
}
