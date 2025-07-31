package Recursion;

public class skipChar {
    public static void main(String[] args) {
           System.out.println(skippedStr("bcabaacega", 'a', 0, ""));
    }

    public static String skippedStr(String str, char ch, int idx, String ans){
        if(idx >= str.length()){
            return ans;
        }

        if(str.charAt(idx) != ch){
            ans += str.charAt(idx);
//            return skippedStr(str, ch, idx + 1, ans += str.charAt(idx));
//            System.out.println(ans);
        }



        return skippedStr(str, ch, idx + 1, ans);
    }
}
