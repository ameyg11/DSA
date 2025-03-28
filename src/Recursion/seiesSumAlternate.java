package Recursion;

import java.util.Scanner;

public class seiesSumAlternate {

    static int printAlterSeriesSum(int n){
        if (n == 0){
            return 0;
        }

        if (n % 2 == 0){
            return printAlterSeriesSum(n-1) - n;
        }
        else
            return printAlterSeriesSum(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");
        int n = sc.nextInt();

        System.out.println(printAlterSeriesSum(n));
    }
}
