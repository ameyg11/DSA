package arrayProblems;

import java.util.Scanner;
import  java.util.Arrays;

class plus{
    static int[] plusOne(int[] arr){
        int a=0;
        int b;
        for (int i=0;i<arr.length; i++){
            a=a*10+arr[i];
        }
        a++;
        int[] arr2=new int[arr.length+1];
        for (int i=arr2.length-1; i>=0; i--){              //traverse array from back
            b=a%10;
            arr2[i]=b;
            a=a/10;
        }
        return arr2;
    }
}

public class plusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter Elements Of Array : ");

        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(plus.plusOne(arr)));
        System.out.println(10%10);
        System.out.println(1%10);
    }
}
