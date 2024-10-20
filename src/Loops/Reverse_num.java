package Loops;
import java.util.Scanner;
public class Reverse_num {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=scan.nextInt();
        int ans=0;
        int a;
        while(n>0){
            ans = ans*10 +(n%10);
            n=n/10;
        }
        System.out.println("Reversed No. is: "+ans);

        while(n>0){
            a = n%10;
            ans = ans *10 + a;
            n=n/10;
        }
        System.out.println(ans);
    }
}
