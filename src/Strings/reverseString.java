package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        int j = 0;

        for (int i=0; i<str.length(); i++){

            StringBuilder sb = new StringBuilder("");
            if (str.charAt(i) == ' ' || i == str.length() - 1){
                sb.append(str.substring(j,i+1)).reverse();
                ans += sb.toString();
                j = i;
            }
        }
        System.out.print(ans);
    }
}

/*
*
    import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else { // space encountered
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }

        // Reverse and add the last word (as there is no space after the last word)
        sb.reverse();
        ans += sb;

        System.out.println(ans);
    }
}

* */