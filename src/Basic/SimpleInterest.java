package Basic;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        int principal=sc.nextInt();            // take float everywhere instead of int because interest will come in decimal point
        System.out.println("Enter ROI");
        int ROI=sc.nextInt();
        System.out.println("Years");
        int years=sc.nextInt();                            // take float everywhere instead of int because interest will come in decimal point
        int SimpleInterest=(principal*ROI*years)/100;               // take float everywhere instead of int because interest will come in decimal point
        System.out.println("Simple Interest is:"+SimpleInterest);
    }
}
