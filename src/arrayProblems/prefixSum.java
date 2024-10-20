package arrayProblems;
import java.util.Arrays;
import java.util.Scanner;

//lecture prfix sum

class Prefix{
    public static int[] prefixsum(int[] arr,int n){

        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sumQuerries(int[] arr,int s,int e ,int q){

        while (q-->0) {
            int totalSum = arr[s];
            for (int i = s + 1; i <= e; i++) {
                totalSum += arr[i];
            }
            System.out.println(totalSum);
        }
    }
}


public class prefixSum {
    public static void main(String[] args) {
        new Scanner(System.in);

        Prefix obj=new Prefix();
        Scanner sc =new Scanner(System.in);
        System.out.print ("Enter array size ");
        int n = sc.nextInt();
        int[] arr =new int[n];

        System. out. println ( " Enter Arrays Elements ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print ("Enter array2 size ");
        int a = sc.nextInt();
        int[] arr2 =new int[a];
        System. out. println ( " Enter Arrays 2 Elements ");
        for(int i=1; i<a; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter from where to start");
        int s=sc.nextInt();

        System.out.println("Enter where to end");
        int e=sc.nextInt();

        System.out.println("Enter no. of queries");
        int q=sc.nextInt();


//        System.out.println(Arrays.toString(arr));

        obj.prefixsum(arr,n);

//        System.out.println(Arrays.toString(arr));

        obj.printArray(arr);

//        System.out.println(Arrays.toString(arr));

        obj.sumQuerries(arr2,s,e,q);
//        obj.printArray(arr);

    }
}
