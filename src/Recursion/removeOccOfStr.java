package Recursion;

import java.util.Scanner;

public class removeOccOfStr {

    static String removeOccurance(String str, int idx){

        String ans = new String();

        // base case
        if(idx == str.length()){
            return "";
        }

        String smallAns =  removeOccurance(str, idx + 1);

        char currChar = str.charAt(idx);

        if(str.charAt(idx) != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(removeOccurance(str, 0));

    }
}
