//second approach without taking new array or without allocating any new memory reverse the array also called reverse array inplace
package arrayProblems;
import java.util.Scanner;
import java.util.Arrays;

class reverse2{
    static int[] rev2(int[] arr,int n){
        int j=n-1;
        int temp=0;
        for (int i=0; i<arr.length/2; i++){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

//            temp=arr[i];       you can also use this while swapping
//            arr[i]=arr[j];
//            arr[j]=temp;

            j--;

        }
        return arr;
    }
}

public class reverseArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverse2 obj=new reverse2();

        System.out.println("Enter No. Of Elements : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(obj.rev2(arr,n)));
    }
}

