package Basic;

import java.util.Scanner;

public class colatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                System.out.print(" " +num);
            } else {
                num = 3 * num + 1;
                System.out.print(" " +num);
            }
        }
        System.out.print(" Final ans is : " +num);
    }
}
