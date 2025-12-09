package Stack;

import java.util.Arrays;
import java.util.Stack;

public class _06NextGreaterElement2 {

    public static int[] findGreaterElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1] = -1;

        for(int i=n-2; i>=0; i--){
            while(st.size() > 0 && arr[i] > st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    /*
    public static int[] findGreaterElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int i = n-1;
        st.push(arr[i]);
        res[i--] = -1;
        while(i >= 0){
            if(arr[i] < st.peek()){
                res[i] = st.peek();
                st.push(arr[i]);
                i--;
            }else{
                while(!(st.peek() > arr[i])){
                    if(st.peek() > arr[i]){
                        res[i] = st.peek();
                        st.push(arr[i]);
                        i--;
                    }
                    if(st.size() != 0){
                        st.pop();
                    }else{
                        st.push(arr[i]);
                        res[i] = -1;
                        i--;
                    }
                }
            }
        }
        return res;
    }
     */ 

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findGreaterElement(arr)));
    }

}
