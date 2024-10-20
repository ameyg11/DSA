package arrayProblems;

import java.util.Arrays;

class Prob1 {
    static int countOccurence(int[] arr,int x){
        int count=0;
        for (int i = 0; i<arr.length; i++){
            if (x == arr[i]) {
                count++;
//                System.out.println("Found at" +i);
            }
        }
        return count;
    }

    static int LastOccurence(int [] arr,int x) {
        int lastOcc = -1;  // we intialize lastOcc as -1 bcz when there will no element it will return -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                lastOcc=i;
//                System.out.println("Found at" +i);
            }
        }
        return lastOcc;
    }

     static int greaterThan(int [] arr, int x){
        int num=0;
        for (int i = 0; i<arr.length; i++){
            if (x <arr[i]) {
                num++;
//                System.out.println("Found at" +i);
            }
        }
        return num;
    }


}

public class problem1 {
    public static void main(String[] args) {

        Prob1 obj=new Prob1();
        int[] arr = {5, 6, 5, 1, 5};
        int x=5;
        int occ =Prob1.countOccurence(arr,x);

        Prob1.countOccurence(arr,x);
        System.out.println("Number " + x + " occurs " + occ + " times in the array.");


        int lst=Prob1.LastOccurence(arr,x);
        System.out.println("Lastly occured at index "+lst);

        int great=Prob1.greaterThan(arr,x);
        System.out.println("The numbers greater than " +x+ " in array are "+great);

//        for (int i = 0; i<arr.length; i++){
//            if (x == arr[i]) {
//                occ++;
////                System.out.println("Found at" +i);
//            }
//        }
//        System.out.println(occ);
    }
}
