package Basic;
import java.util.Scanner;
import pkg.sub.*;


class Aljebra {
    public int sum(int a, int b) {
        int ans= a+b;
        return ans;

    }

}

public class methoDS {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Aljebra obj=new Aljebra();

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(obj.sum(a,b));

        int ans1=obj.sum(a,b);
        System.out.println(ans1);


    }
}
