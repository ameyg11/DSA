package Recursion;

import java.util.Scanner;

public class recursionBasic {

    static void printIncreasing(int n){  // 1, 2, 3 ..... n-1, n

        // base case
        if (n == 1){
            System.out.println(n);
            return;
        }

        // recursive work
        printIncreasing(n-1);  // 1, 2, 3 ..... n-1

        // self work
        System.out.println(n);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printIncreasing(n);
    }
}
