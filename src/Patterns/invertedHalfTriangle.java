package Patterns;

public class invertedHalfTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i > 0; i--){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
