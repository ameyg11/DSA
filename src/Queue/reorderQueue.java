package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n = q.size();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int i=0;
        while(i < n / 2){
            st1.push(q.remove());
            i++;
        }
        while(!q.isEmpty()){
            st2.push(q.remove());
        }
        boolean b = true;
        Stack<Integer> st3 = new Stack<>();
        while(n > 0){
            if(b){
                st3.push(st2.pop());
                b = false;
            }else{
                st3.push(st1.pop());
                b = true;
            }
            n--;
        }

        while(!st3.isEmpty()){
            q.add(st3.pop());
        }
        System.out.println(q);
    }
}
