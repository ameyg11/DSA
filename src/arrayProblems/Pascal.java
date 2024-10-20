package arrayProblems;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. Of Rows");
        int numRows = sc.nextInt();

        int[][] arr = new int[numRows][];

        for (int i=0; i<numRows; i++){
            //ith row has i+1 columns
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;

            for (int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }

    }
}
