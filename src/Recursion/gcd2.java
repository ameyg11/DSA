package Recursion;

import java.util.Scanner;

public class gcd2 {

    static int returnGcd(int x, int y){
//        int z = y % x;
//
//        if (z == 0){
//            return x / y;
//        }
//
//        while(z != 0){
//            y = x;
//            x = z;
//            z = y % x;
//            if(z == 0){
//                return x;
//            }
//        }

        while(x % y != 0){
            int z = x % y;
            x = y;
            y = z;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number :");
        int x = sc.nextInt();
        System.out.print("Enter your second number :");
        int y = sc.nextInt();

//        System.out.println(x/y);
//        System.out.println(x%y);
//        System.out.println(y%x);
//        System.out.println(y/x);

//        if(x > y){
//            int temp = x;
//            x = y;
//            y = temp;
//        }

        System.out.println(returnGcd(x,y));
    }
}
