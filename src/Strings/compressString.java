package Strings;

import java.util.Scanner;

public class compressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = "";
        int count = 1;

        for (int i=1; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch == str.charAt(i-1) ){
                count++;
            }else{
                ans += str.charAt(i-1) + "" + count;
                count = 1;
            }

        }
        ans += "" + str.charAt(str.length() - 1) + count;
        System.out.print(ans);
    }
}
