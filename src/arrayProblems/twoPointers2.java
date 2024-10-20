package arrayProblems;


import java.util.Arrays;

public class twoPointers2 {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,7,8,4,9};





        int i=0;
        int j=arr.length-1;

        while (i<j){
            if (arr[i]%2!=0 && arr[j]%2==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
        System.out.println("Even And Odd Array Is : "+ Arrays.toString(arr));
    }
}
