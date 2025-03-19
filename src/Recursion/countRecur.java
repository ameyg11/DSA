package Recursion;

public class countRecur {

    static int counts(int num){


        // base case
        if (num == 0) return 0;

        // recursive case
        int count = counts(num/10) + 1;

        return count;
    }

    public static void main(String[] args) {
        int ans = counts(7562153);
        System.out.println(ans);
    }
}
