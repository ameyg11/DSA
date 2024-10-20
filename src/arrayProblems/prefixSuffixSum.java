package arrayProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

class suffix{
//    static void printArray(int[] arr){
//        int n=arr.length;
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static int[] prefixSum(int[] arr,int n){
//
//        for (int i=1;i<arr.length;i++){
//            arr[i]=arr[i]+arr[i-1];
//        }
//        return arr;
//    }

    static boolean bothSums(int[] arr,int totalSum){
        int prefixSum=arr[0];
        int suffixSum=0;

        for (int i=1; i<arr.length; i++) {
            prefixSum += arr[i];
            suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }

        }
        return false;
    }
}



public class prefixSuffixSum {
    public static void main(String[] args) {

        suffix obj = new suffix();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" Enter Arrays Elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        System.out.println(Arrays.toString(arr));

        boolean ans = obj.bothSums(arr, totalSum);
        System.out.println(ans);

//        System.out.println(removeDuplicates(arr));

        int i = 0;
        for (int z : arr) {
            if (i < 1 || z > arr[i - 1]) {
                arr[i] = z;
                i++;
            }
        }
        System.out.println(i);
        System.out.println(Arrays.toString(arr));


//            public static int removeDuplicates ( int[] nums){
//
//                int i = 0;
//                for (int n : nums) {
//
//                    if (i < 1 || n > nums[i - 1]) {
//                        nums[i] = n;
//                        i++;
//                    }
//                }
//                return i;
//            }
        }
    }