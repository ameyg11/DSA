package Strings;
import java.util.*;

public class _01_basicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //<----------------------------declaration or initialization ------------------------->
//        String str = "Amey Gawade";

        //<--------------------taking input------------------->
//        System.out.println(str);
//        String str = sc.next();
//        System.out.println(str);
//        String str = sc.nextLine();
//        System.out.println(str);

        //<---------------------String methods------------------------>
//        System.out.println(str.length());
//        System.out.println(str.charAt(6));


//        String a = "amey";
//        String b = "amey";
//        String c = new String("amey");
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(a.equals(c));

        //<------------------------ASCII values------------------------------->
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 'b');



        String str = "Amey Gawade";
        System.out.println(str.trim().toLowerCase());
        System.out.println(str.indexOf('w'));  // returns first occurence/index of character
//        System.out.println();
        String gtr = "Amey Gawade";
        System.out.println(str.compareTo(gtr));  //if two strings are same it returns 0(zero)
    }
}