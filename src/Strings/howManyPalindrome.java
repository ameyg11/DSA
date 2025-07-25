package Strings;

import java.util.Scanner;

public class howManyPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.nextLine());
        String str = sc.nextLine();
        int count = 0;

        for (int i =0; i< str.length(); i++){
            for (int j= i+1; j<str.length() + 1; j++){
                String sub = str.substring(i, j);

//                StringBuilder pali = new StringBuilder(str.substring(i, j));
//                System.out.println(pali);

                String rev = new StringBuilder(sub).reverse().toString();
                if (sub.equals(rev)) count += 1;
            }
        }
        System.out.println(count);
    }
}
