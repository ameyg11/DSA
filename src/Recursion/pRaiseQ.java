package Recursion;

public class pRaiseQ {

    static int raiseTo(int p, int q){
        if (q <= 0){
            return 1;
        }

        int smallPrb = raiseTo(p,q-1);

        int ans = smallPrb * p;

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(raiseTo(9,3));
    }
}
