package Recursion;

public class factorial {

    static int fact(int n){

        // base case
        if(n == 0) return 1;

        // smaller problem - recursive work
        int smallProb = fact(n-1);

        // bigger problem - self work
        int ans = n * smallProb;

        return ans;

        /*
        or you can write this way also where code ends just in 2 lines
        if(n == 0) return 1;
        return n * fact(n-1);
         */
    }

    public static void main(String args[]){
        System.out.println(fact(5));
    }
}
