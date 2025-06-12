package Recursion;

public class reverseString {

    static String reversedString(String str, int idx){
        if(idx == str.length()) return "";

        String smallAns = reversedString(str, idx + 1);
        char currentChar =  str.charAt(idx);

        return smallAns + currentChar;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reversedString(str,0));
    }
}
