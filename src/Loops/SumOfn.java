package Loops;
import java.util.Scanner;

public class SumOfn {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Num");
        int n=scan.nextInt();
        int num=0;
        int original_n = n;
            while (n > 0) {
                num += (n % 10);
                n = n/10;

            }
        System.out.println(+num);
    }
}
