package Loops;
import java.util.Scanner;


public class EvenOdd {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Num is even");
        }
        else{
            System.out.println("Num is odd");
        }

    }
}
