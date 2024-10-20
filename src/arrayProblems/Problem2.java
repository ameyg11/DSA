//Check if the given array is sorted or not.

package arrayProblems;

import java.util.Arrays;


class Arr{
    static int[] smallestLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0], arr.length-1};
        return ans;
    }

}

public class Problem2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        boolean check=true;


        for (int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check =false;
                break;
            }
        }
        System.out.println("Array Is sorted "+check);
//        int i=0;
//        int j=i+1;
//        while (arr[i]<arr[j]){
//            //System.out.print("sorted");
//            i++;
//        }



    }
}
