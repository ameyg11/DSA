package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseKQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        int k = 2;
        System.out.println(q);
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<k; i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0; i<q.size()-k; i++){
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
