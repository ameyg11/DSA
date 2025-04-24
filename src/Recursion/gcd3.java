package Recursion;
import java.util.Scanner;

public class gcd3 {

    static int gcd(int x,int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number :");
        int x = sc.nextInt();
        System.out.print("Enter your second number :");
        int y = sc.nextInt();

        System.out.println(gcd(x,y));
    }
}
