package Recursion;

import java.util.Scanner;

public class removeOccOfStr {

    static String removeOccurance(String str, String alpha, int idx){

        String ans = new String();

        // base case
        if(idx >= str.length()){
            return ans;
        }

        if(str.charAt(idx) != 'a'){
            ans += str.charAt(idx);
        }

        removeOccurance(str, alpha, idx + 1);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String alpha = sc.next();

        System.out.print(removeOccurance(str, alpha, 0));

    }
}
