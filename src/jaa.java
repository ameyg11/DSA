import java.util.*;

public class jaa {

    public static void reverse(int[] arr, int i, int j){

        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,1,2,3,4,5};

        int k=7;
        int n=arr.length;
        k=k%n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}
