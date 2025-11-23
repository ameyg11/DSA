package Stack;

import java.util.Scanner;
import java.util.Stack;

public class copyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        // reverse stack
        Stack<Integer> st2 = new Stack<>();

        while(st.size() > 0){
            int ele = st.pop();
            st2.push(ele);
        }

        Stack<Integer> st3 = new Stack<>();

        while(st2.size() > 0){
            int ele = st2.peek();
            st3.push(ele);
            st2.pop();
        }
        System.out.println(st3);
    }
}
