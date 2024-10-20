package Basic;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price:");
        int cost = sc.nextInt();
        System.out.println("Enter Selling Price");
        int sp=sc.nextInt();
        if(cost<sp){
            System.out.println("Seller had made profit of :"+(sp-cost));
        }
        else{
            System.out.println("Seller has made loss of :"+(cost-sp));
        }

    }
}
