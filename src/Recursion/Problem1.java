package Recursion;

import java.util.Scanner;

public class Problem1 {

    static void printOrder(int num){ // 5,4,3,2,1

        // base case
        if (num == 1){
            System.out.println(1);
            return;
        }

        // self work
        System.out.println(num);

        // recursive work
        printOrder(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 1) {
            printOrder(num);
        }
        else System.out.println("Invalid Input");
    }
}
