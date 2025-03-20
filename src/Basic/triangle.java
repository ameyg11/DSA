package Basic;

public class triangle {
    public static void main(String[] args) {
        int rows = 4;
//        int j = rows/2;
        int a = 1;

        for(int i = 1; i <= rows; i++){
            for(int j= 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=a; k++) {
                System.out.print("*");
            }
            a += 2;
            System.out.println("");
        }
    }
}
