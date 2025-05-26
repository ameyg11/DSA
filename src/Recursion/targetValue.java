package Recursion;

public class targetValue {

    public static boolean findValue(int[] arr, int val, int idx){

        // self work
        if(arr[idx] == val){
            return true;
        }

       //  base case
        if(idx >= arr.length - 1){
            return false;
        }

        // recursive work
        return findValue(arr, val, idx +1);

//        if(findValue(arr, val, idx +1)){
//            return true;
//        }else {
//            return false;
//        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int idx = 0, value = 2;

        System.out.println(findValue(arr,value,idx));
    }
}
