package Recursion;

import java.util.ArrayList;

public class findAllIndices {

    static ArrayList<Integer> allIndices(int[] arr, int val, int idx){

        ArrayList<Integer> list = new ArrayList<>();

        // base case
        if(idx > arr.length - 1){
            return list;
        }

        if(arr[idx] == val){
            list.add(idx);
        }

        ArrayList<Integer> smallAns =  allIndices(arr,val,idx + 1);
        list.addAll(smallAns);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,4};
        int idx = 0, target = 4;

        System.out.println(allIndices(arr,target,idx));
    }
}
