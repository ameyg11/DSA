package Strings;

public class validPalindrome {

        public static boolean isPalindrome(String s) {
            // String str = s.replaceAll("\\s","").toLowerCase();
               String x= s.toLowerCase();
            System.out.println(x);

            String s1 = "";
            for(int i=0; i<x.length();i++){
                if(x.charAt(i) >='a' && x.charAt(i) <= 'z' || x.charAt(i) >= '0' && x.charAt(i) <= '9') s1 += x.charAt(i);
            }


            System.out.println(s1);

            int i= 0;
            int j = s1.length()-1;

            while(i<j){
                if(s1.charAt(i) != s1.charAt(j)) return false;
                i++;
                j--;
            }


            return true;
        }
    public static void main(String[] args) {
        validPalindrome a = new validPalindrome();

        boolean result = isPalindrome("0P");

        System.out.println(result);
    }
}
