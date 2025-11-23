package Stack;

import java.util.Stack;

public class reverseStackUsingRec {

    public static void pushAtBottom(Stack<Integer> st, int ele){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(ele);
//        System.out.println(st);
        while(rt.size()>0){
            st.push(rt.pop());
        }
//        System.out.println(st);
    }

    public static void justReverseIt(Stack<Integer> st){
        if(st.size() == 1) return;

        int top = st.pop();
        justReverseIt(st);
        pushAtBottom(st, top);

    }

    public static void main(String[] args) {
        Stack<Integer> st =  new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        justReverseIt(st);
        System.out.println(st);
    }
}
