package Strings;
import java.util.*;

public class vowelSort {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
        public static String sortVowels(String s) {
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0; i<s.length(); i++){
                if(isVowel(s.charAt(i))){
                    int vowelAscii = s.charAt(i);
                    arr.add(vowelAscii);
                }
            }
            Collections.sort(arr);
            String ans = "";
            int j = 0;

            for(int i=0; i<s.length(); i++){
                if(isVowel(s.charAt(i))){
                    ans += ((char)(int)arr.get(j));
                    j++;
                }else{
                    ans += s.charAt(i);
                }
            }
            return ans;
        }

    public static Boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

}
