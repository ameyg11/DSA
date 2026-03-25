package Recursion;

import java.util.ArrayList;

public class subsetsArray {

    public static void ps(int[] arr, ArrayList<Integer> ans, int i){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }

        // include
        ans.add(arr[i]);
        ps(arr, ans, i+1);

        //exclude
        ans.remove(ans.size() - 1);
        ps(arr, ans, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();

        ps(arr, ans, 0);

    }
}
