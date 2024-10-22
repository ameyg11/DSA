package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length");
        int len = sc.nextInt();


        int[] arr = new int[len];

        System.out.println("Enter Array Elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            ans[i] = arr[arr[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
