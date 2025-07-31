package Recursion;

public class skipStr {
    public static void main(String[] args) {
        System.out.println(skippedStr("abapplecd", "apple", 0, ""));
    }

    public static String skippedStr(String str, String rem, int idx, String ans){
        if(idx >= str.length()){
            return ans;
        }

        if(str.substring(idx).startsWith("apple")){
            idx += rem.length() - 1;
        }else ans += str.charAt(idx);

        return skippedStr(str, rem, idx + 1, ans);
    }
}
