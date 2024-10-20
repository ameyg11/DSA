package Basic;

public class Operators2 {
    public static void main (String args[]){
        int a=4;
        int b=16;

        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a>=b); //false
        System.out.println(a<=b); //true
        System.out.println(a<b);  //true


        System.out.println("----------------------------------------");


        System.out.println(a<b && b>=a); //true
        System.out.println(a>b || a==b); //false
        System.out.println(!(a==b));     //true

        System.out.println("----------------------------------------");
            int var;
        var=a;
        System.out.println("Var using ="+a);
    }
}
