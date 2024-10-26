package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfRectangle {
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

        for (int i=l1; i<=l2; i++){
            for (int j=r1; j<=r2; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
