package arrayProblems;
import java.util.Scanner;

class GenerateSpiral {
    static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){

        int[][] matrix =new int[n][n];
        int topRow= 0, bottomRow= n-1, leftCol= 0, rightCol= n-1;
        int current = 1;

        while(current<= n*n){
            //topRow => leftCol to rightCol
            for (int j=leftCol; j <= rightCol && current <= n*n; j++){
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;

            //rightCol => topRow to bottomRow
            for (int i=topRow; i<=bottomRow && current <= n*n; i++){
                matrix[i][rightCol] = current++; //using post increament operator
            }
            rightCol--;

            //bottomRow => rightCol to leftCol
            for (int j=rightCol; j>=leftCol && current <= n*n; j--){
                matrix[bottomRow][j]= current++;
            }
            bottomRow--;

            //leftCol => bottomRow to topRow
            for (int i=bottomRow; i >= topRow && current <= n*n; i--){
                matrix[i][leftCol] = current++;
            }
            leftCol++;

        }
        return matrix;
    }


}

public class spiralMatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int[][] matrix = GenerateSpiral.generateSpiralMatrix(n);
        GenerateSpiral.printMatrix(matrix);

    }
}
