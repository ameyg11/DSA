package Stack;

import java.util.Arrays;
import java.util.Stack;

public class _04RemoveConsecutiveSubsequences {

    public static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }else if(st.peek()==arr[i] && i != arr.length-1){
                if(arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        } 
        int[] ans = new int[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res = remove(arr);
        System.out.println(Arrays.toString(res));
    }
}
