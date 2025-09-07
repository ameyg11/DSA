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
    static String removeOcc(String str, int idx, String ans){


        if(idx >= str.length()){
            return ans;
        }

        if(!(str.charAt(idx) == 'a')){
            ans += str.charAt(idx);
        }

        return removeOcc(str, idx+1, ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(removeOccurance(str, 0));

        System.out.print(removeOcc(str, 0, ""));

    }
}
