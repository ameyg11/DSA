package Recursion;

public class sumOfDigits {

    static int f(int num){

        //base case
        if (num >= 0 && num < 10){
            return num;
        }

        // resursive work          // self work
        int ans = f(num/10) + num % 10;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(f(1234));
    }
}
