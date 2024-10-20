package arrayProblems;
import java.util.Scanner;
import java.util.Arrays;

 class triplet{
//    public int[] sum(int[] arr,int target){
public int sum(int[] arr,int target){


    int n=arr.length;
        int ans=0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        int[] arr2={i,j,k};
                        System.out.println(Arrays.toString(arr2));
                        ans++;
//                        return arr2;
                    }
                }
            }
        }
        return ans;
//        return new int[] {};

    }
}

public class tripletSum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        triplet obj =new triplet();

        System.out.println("Enter Array Size :");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter Target Value : ");
        int target=sc.nextInt();

        System.out.println("Enter Elements Of Array :");
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

//        int[] arr2=obj.sum(arr,target);

//        System.out.println(Arrays.toString(arr2));
        obj.sum(arr,target);
    }
}
