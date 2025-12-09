package Stack;

import java.util.Arrays;
import java.util.Stack;

public class _08LargestRectangleInHistogram {


    public static int[] previousSmallerIndex(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        pse[0] = -1;
        st.push(0);

        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }else if(arr[st.peek()] < arr[i]){
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    public static int[] nextSmallerIndex(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        nse[n-1] = -1;
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = -1;
            }else if(arr[i] > arr[st.peek()]){
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 3, 5 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextSmallerIndex(arr)));
        System.out.println(Arrays.toString(previousSmallerIndex(arr)));

    }
}
