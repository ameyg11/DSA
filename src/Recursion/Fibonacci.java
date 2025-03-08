package Recursion;

public class Fibonacci {

    static int fib(int n){

        // base case
        if(n == 0 || n == 1) return n;

        // subproblem - recursion
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        // self work
        return prev + prevPrev;
    }

    public static void main(String[] args) {
        System.out.println("Your nth fibonacci number is : "+fib(10));

        System.out.print("Your fibonacci series is ");
        for(int i= 0; i<= 10; i++){
            System.out.print(" "+fib(i));
        }
    }
}
