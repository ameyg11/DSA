package Recursion;

public class returnSSQ2 {

    static void getSSQ(String str,int idx, String newString){

        // base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);

        getSSQ(str, idx+1, newString + curr);
        getSSQ(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        getSSQ(str,0, "");
    }
}
