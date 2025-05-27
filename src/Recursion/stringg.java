package Recursion;

import java.util.Scanner;

public class stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(str);
//        String str2 = sc.nextLine();
//        System.out.print(str2);

//        System.out.print(str.charAt(2));
        for (int i = 0; i< str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println(str.substring(2,5));
    }
}
