package arrayProblems;
import java.util.Arrays;
import java.util.Scanner;

class point{
     static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int[] sortZerosAndOnes(int[] arr){
         int n=arr.length;
         int zeros=0;

         for(int i=0; i<n; i++){
             if(arr[i]==0){
                 zeros++;
             }
         }
         for(int i=0; i<n; i++){
             if(i<zeros){
                 arr[i]=0;
             }
             else{
                 arr[i]=1;
             }
         }
        return arr;
    }

    static int[] sortZeroAndOne(int[] arr){
         int left=0;
         int right=arr.length-1;

         while(left<right){
             if (arr[left]==1 && arr[right]==0){
                 swap(arr,left,right);
                 left++;
                 right--;
             }

             if (arr[left]==0){
                 left++;
             }

             if (arr[right]==1){
                 right--;
             }
         }
         return arr;
    }

    static int[] evenAndodd(int[] arr){
         int i=0;
         int j=arr.length-1;

         while (arr[i]>arr[j]){
             if (arr[i]%2!=0&&arr[j]%2==0){
                 swap(arr,i,j);
                 i++;
                 j--;
             }

             if (arr[i]%2==0){
                 i++;
             }

             if (arr[j]%2!=0){
                 j--;
             }
         }
        System.out.println("Even And Odd Array Is : "+arr);
         return arr;
    }

}

public class twoPointers1 {
        public static void main(String[] args) {
            point obj=new point();
            new Scanner(System.in);
            Scanner sc =new Scanner(System.in);
            System.out.print ("Enter array size ");
            int n = sc.nextInt();
            int[] arr =new int[n];

            System. out. println ( " Enter Arrays Elements ");
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Print Original Array");
            obj.printArray(arr);

            obj.swap(arr,0,1);

            obj.sortZerosAndOnes(arr);
            System.out.println("Sorted Array ");
            obj.printArray(arr);
            System.out.println("Sorted Array 2 : ");
            obj.sortZeroAndOne(arr);
            obj.printArray(arr);
            obj.evenAndodd(arr);
            System.out.println("Even and Odd array is : ");
            obj.printArray(arr);
    }
}
