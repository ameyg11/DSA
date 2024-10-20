//package Basic;
//
//import java.util.Scanner;
//public class AdditionOfTwoNo {
//    public static void main (String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Num:");
//        int num_1=sc.nextInt();
//        System.out.println("Enter a Num:");
//        int num_2=sc.nextInt();
//        int sum=num_1+num_2;
//        System.out.println("Addition is:"+sum);
//    }
//}

package Basic;
import java.util.Scanner;
    public class AdditionOfTwoNo {

        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a no. 1 :");
            int num1=scan.nextInt();
            System.out.println("Enter a no. 2 :");
            int num2=scan.nextInt();
            int ans=num1+num2;
            System.out.println("Your Answer Is :" +ans);
        }
    }


