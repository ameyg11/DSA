package arrayProblems;
import java.util.Scanner;
import java.util.Arrays;

public class theifProb {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no. of houses : ");
        int noOfHouses=sc.nextInt();

        System.out.print("Enter max. money : ");
        int stolenMoney=sc.nextInt();

        int maxMoney;

        if(noOfHouses%2==0){
            maxMoney=(noOfHouses/2)*stolenMoney;
        }
        else{
            maxMoney=((noOfHouses/2)+1)*stolenMoney;
        }
        System.out.println(maxMoney);
    }
}
