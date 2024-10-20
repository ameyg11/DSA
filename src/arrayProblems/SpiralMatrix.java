package arrayProblems;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. Of Rows");
        int r = sc.nextInt();
        System.out.println("Enter No. Of Columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int topRow= 0, bottomRow= r-1, leftCol= 0, rightCol= c-1;
        int totalElements = 0;

        while(totalElements < r*c){
            //topRow => leftCol to rightCol
            for (int j=leftCol; j <= rightCol; j++){
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            //rightCol => topRow to bottomRow
            for (int i=topRow; i<=bottomRow && totalElements < r*c; i++){
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            //bottomRow => rightCol to leftCol
            for (int j=rightCol; j>=leftCol && totalElements < r*c; j--){
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            //leftCol => bottomRow to topRow
            for (int i=bottomRow; i >= topRow && totalElements < r*c; i--){
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;


        }
    }
}