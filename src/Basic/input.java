package Basic;

import java.sql.SQLOutput;
import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. :");
        int num1=sc.nextInt();
        System.out.println("Enter your favourite no. ");
        int num2=sc.nextInt();
        System.out.println("your no. is :"+(num1+num2));
        System.out.println("Enter our name :");
        String name=sc.next();
        System.out.println("your name is"+name);
        System.out.println("Enter our name :");
//        System.out.println("weeeeeeee");
        char clg;
        clg = sc.next().charAt(4);
        System.out.println(clg);
    }
}
