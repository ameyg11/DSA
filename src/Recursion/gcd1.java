package Recursion;

import java.util.Scanner;

public class gcd1 {

    static int gcdBrute(int x, int y) {
        int min = x ;  // start with x not x-1 bcz it will give wrong ans of 2,4
        while (min >= 0) {
            if (x % min == 0 && y % min == 0) {
                return min;
            }
            min--;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number :");
        int x = sc.nextInt();
        System.out.print("Enter your second number :");
        int y = sc.nextInt();

        System.out.println("Greatest Common Divisor is : " +gcdBrute(x, y));
    }
}
