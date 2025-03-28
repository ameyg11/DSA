package Recursion;

import java.util.Scanner;

public class seriesSum {

    static int printSum(int n){
        if (n == 0){
            return 0;
        }
        int ans = printSum(n-1);

        return ans + n;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");
        int n = sc.nextInt();
        System.out.println("Series sum of your number is: "+printSum(n));
    }
}
