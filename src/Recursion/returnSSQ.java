package Recursion;

import java.util.ArrayList;

public class returnSSQ {

    static ArrayList<String> getSSQ(String str){

        ArrayList<String> ans = new ArrayList<>();

        // base case
        if(str.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = str.charAt(0);
        ArrayList<String> smallAns = getSSQ(str.substring(1));

        // smallAns = ["bc", "b", "c", ""]
        // ans = ["bc", "b", "c", "", "abc", "ab", "ac", "a"]

        for (String s: smallAns){
            ans.add(s); // ""
            ans.add(curr + s); // a
        }

        return ans;
    }

    public static void main(String args[]){
        String str = "abc";

        System.out.println(getSSQ(str));
    }
}