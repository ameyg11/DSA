package arrayProblems;
import java.util.Arrays;
import java.util.Scanner;

class queries{

    static int[] makeFrequencyArray(int[] arr){
        int[] freq=new int[100005];
        for (int i=0;i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    static void check(int[] arr){

    }
}

public class queriesArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size Of An Array : ");
        int n= sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter Array Elements : "); 
        for (int i=0; i<n; i++){
           arr[i]=sc.nextInt();
        }

        int[] freq=queries.makeFrequencyArray(arr);

        System.out.println("Enter No. Of Queries : ");
        int q=sc.nextInt();

        while(q>0){
            System.out.print("Enter no. to be searched : ");
            int x=sc.nextInt();
            if (freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }

    }
}
