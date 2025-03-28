package Recursion;

import java.util.Scanner;

public class kMultiN {

    static void KmutipleN(int n, int k){
        if (k == 1){                             // if k == 0 then directly return without printing n;
            System.out.println(n);
            return;
        }
        KmutipleN(n,k-1);

        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");
        int n = sc.nextInt();

        System.out.print("Enter your multiple :");
        int k = sc.nextInt();

        KmutipleN(n,k);
    }
}
