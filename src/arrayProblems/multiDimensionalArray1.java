package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArray1 {

    static void add(int[][] arr,int r1,int c1,int[][] arr2,int r2,int c2){
        if (r1!=r2 || c1!=c2){
            System.out.println("wrong input - addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i=0; i<r1; i++){
            for (int j=0; j<c1;j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        printArr(sum);
    }

    static void printArr(int[][] arr){
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    static void multiply(int[][] arr,int r1, int c1, int[][] arr2, int r2, int c2){
        int[][] mul = new int[r1][c2];

        for (int i=0; i<r1; i++){  //row number
            for (int j=0; j<c2; j++){  //column number

                for (int k=0 ;k<c1; k++){
                    mul[i][j] += (arr[i][k] * arr2[k][j]);
                }
            }
        }
        printArr(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows :" );
        int r =sc.nextInt();
        System.out.println("Enter no. of columns :" );
        int c =sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter Array1 Elements");
        for (int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no. of rows :" );
        int r2 =sc.nextInt();
        System.out.println("Enter no. of columns :" );
        int c2 =sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter Array2 Elements");
        for (int i=0; i<c2; i++){
            for(int j=0; j<r2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

//        int[][] arr = {{1,2,3},{5,6,7,4},{8,9,1}};

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Addition of array");

//        add(arr,r,c,arr2,r,c);

        System.out.println("Multiplication of array");

        multiply(arr,r,c,arr2,r,c);


    }
}
