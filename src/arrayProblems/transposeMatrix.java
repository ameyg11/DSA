package arrayProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class transposeMatrix {

    static void printArr(int[][] arr){
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    static void transposeMatrix1(int[][] arr, int r, int c){
        int[][] transpose = new int[c][r];

        for (int i=0; i<c ;i++){
            for (int j=0; j<r; j++){
                transpose[i][j] = arr[j][i];
            }
            System.out.println();
        }
        printArr(transpose);
    }

    static void inPlaceTranspose(int[][] arr, int r, int c){

        for (int i=0; i<r; i++){
            for (int j=i; j<c; j++){
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        printArr(arr);
    }

    static void reverseArrays(int[] arr){
        int i=0;
        int j=arr.length -1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateMatrix(int[][] arr,int n){
        transposeMatrix1(arr,n,n);

        for (int i=0; i<n; i++){
            reverseArrays(arr[i]);
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter no. of rows :" );
        int r =sc.nextInt();
        System.out.println("Enter no. of columns :" );
        int c =sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter Array1 Elements");
        for (int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        transposeMatrix1(arr,r,c);

        inPlaceTranspose(arr,r,c);
//        printArr(arr);

        rotateMatrix(arr,c);
    }
}
