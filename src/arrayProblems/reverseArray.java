package arrayProblems;
import java.util.Scanner;
import java.util.Arrays;

class reverse{
    public int[] rev(int[] arr,int n){
        int[] arr2=new int[n];
        int j=0;
        for (int i=n-1; i>-1; i--){
            arr2[j]=arr[i];          //you can use here j++ becouse it is post increament operator first it will assign j=0 and then increament
            j++;
        }

        //second approch
//        int i=n-1;
//        while(i>=0){
//            arr2[j]=arr[i];
//            j++;
//            i--;
//        }
        return arr2;
    }
}
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverse obj=new reverse();

        System.out.println("Enter No. Of Elements : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(obj.rev(arr,n)));
    }
}
