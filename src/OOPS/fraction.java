package OOPS;

public class fraction {

    public static int gcd(int num, int den){
        int min = Math.min(num, den);

        for(int i=min; i>=1; i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }

    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }

        public void simplify(){
            int hcf = gcd(num, den);
            num/= hcf;
            den/= hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 21);
        System.out.println(f1.num + "/" + f1.den);
//        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);
//        Fraction f2 = new Fraction(2, 4);
//        System.out.println(f2.num + "/" + f2.den);
    }
}
