package Basic;

public class MathExample {
    public static void main(String args[]){
        double x= 16;
        int y= 4;

        System.out.println("Maximum no. of x & y is : "+Math.max(x,y));
        System.out.println("Square root of 16 is :"+Math.sqrt(x));
        System.out.println("Logarithm of x is :"+Math.log(x));
        System.out.println("Logarithm of x is :"+Math.log(y));
        System.out.println(" x to the power y is :"+Math.pow(x,y));
        System.out.println("Absolute value of x is :"+Math.abs(x));

        double a=Math.max(x,y);
        System.out.println(a);
    }
}
