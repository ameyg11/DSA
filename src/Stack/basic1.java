package Stack;

import java.util.Scanner;
import java.util.Stack;

public class basic1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(22);
        st.push(33);
        st.push(44);

        // peeking the last element
        System.out.println(st.peek());

        // printing the stack
        System.out.println(st);
        st.add(1, 11);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is : " +st.size());
        st.remove(2);
//        System.out.println(st);


        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
        int n;
        System.out.print("Enter the no. of elements you want to insert: ");
        n = sc.nextInt();
        System.out.print("Enter the elements you want to insert: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
