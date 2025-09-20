package BinarySearch;

public class findSqrt {

    static int sqrt(long x){
        long s=0, e=x;
        int  ans=-1;
        while(s<=e){
            long mid = s + (e-s)/2;
            long value = mid * mid;
            if(value == x){
                return (int) mid;
            }else if(value < x){
                ans = (int) mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long x = 25;
        System.out.println(sqrt(x));
    }
}
