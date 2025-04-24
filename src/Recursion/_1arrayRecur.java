package Recursion;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;


public class _1arrayRecur {

    static void printArray2(int[] arr, int num){
        if (num == 0){
            System.out.println(arr[num]);
            return;
        }

        printArray2(arr,num - 1);
        System.out.println(arr[num]);
    }
    static void printArray(int[] arr, int num){
        if(num >= arr.length){
            return;
        }
        System.out.println(arr[num]);
        printArray(arr,num + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        printArray(arr,0);
        printArray2(arr,n-1);
    }
}
