package Recursion;

public class reverseString {

    static String reversedString(String str, int idx){
        if(idx == str.length()) return "";

        String smallAns = reversedString(str, idx + 1);
        char currentChar =  str.charAt(idx);

        return smallAns + currentChar;
    }

    static String reversedStr(String str, int idx, String ans){
        if(idx == str.length()) return ans;

        String smallAns = reversedStr(str, idx + 1, ans);

        return ans + str.charAt(idx );
    }


    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reversedString(str,0));
        System.out.println(reversedStr(str,0, ""));

    }
}
