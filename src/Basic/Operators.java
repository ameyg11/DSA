package Basic;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String args[]){
        int a=4,b=2,c=6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println("division is:"+(a/b));
        System.out.println(++a);
        System.out.println(b--); //first b is printed then decrement happens so ans is 2 & downside value of b becomes 1
        System.out.println(+b);  //search why this answer is 1 ????????????????????????
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a<b); //false
        System.out.println(a!=b && a>b); //true
        System.out.println(a==b || a<b);
        System.out.println(a%b);
    }
}
