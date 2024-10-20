package Loops;
import java.util.Scanner;
//count the number of digits for a given number n
public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num. :");
//        long n = sc.nextLong();
//        int numOfDigits = 0;
//        long original_n = n;
//
//        while (n > 0) {
//            n = n / 10;
//            numOfDigits++;
//        }
//        System.out.println("No. of digits in " +original_n + "=" +numOfDigits);

        int dig=0;
        int num = sc.nextInt();
        while(num>0){
            num =num/10;
            dig++;

        }
        System.out.println(+dig);

    }
}