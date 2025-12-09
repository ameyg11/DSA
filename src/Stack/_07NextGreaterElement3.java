package Stack;

import java.util.Arrays;
import java.util.Stack;

// we are solving this problem using the index

public class _07NextGreaterElement3 {

    public static int[] findGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Initialize all results as -1
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                res[st.pop()] = arr[i];
            }

            st.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findGreaterElement(arr)));
    }
}
