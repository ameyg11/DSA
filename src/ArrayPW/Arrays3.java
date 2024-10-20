package ArrayPW;

import java.util.Arrays;
class Arry{
     void printArray(int [] arr){
         for (int i=0; i<arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
    }
}
public class Arrays3 {
    public static void main(String[] args) {

        Arry obj = new Arry();
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("orignal array");
        obj.printArray(arr);


        int[] arr_2=arr.clone();




        System.out.println("duplicate array");
        obj.printArray(arr_2);

        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("orignal array after changing ");
        obj.printArray(arr);

        System.out.println("duplicate array after changing ");
        obj.printArray(arr_2);

        int[] arr_3=new int[5];

        arr_3[1]=0;

        arr_3=arr;

        arr_3[1]=9;


        int[] arr_5=Arrays.copyOfRange(arr,2,4);
        System.out.println("Array5");
        obj.printArray(arr_5);

        int[] arr_4=Arrays.copyOf(arr,4);
        System.out.println("Array4");
        obj.printArray(arr_4);

        System.out.println("Array3");
        obj.printArray(arr_3);
        obj.printArray(arr);

    }
}
