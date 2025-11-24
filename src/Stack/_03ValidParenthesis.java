package Stack;

import java.util.Scanner;
import java.util.Stack;

public class _03ValidParenthesis {

    public static boolean isValid(String s) {
            int i=0;
            Stack<Character> st = new Stack<>();

            while(i<s.length()){
                char ch = s.charAt(i);

                if(ch == '(' || ch == '{' || ch == '[' ){
                    st.push(ch);
                }else{
                    if(st.isEmpty()){
                        return false;
                    }else{
                        char top = st.peek();
                        if((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')){
                            st.pop();
                        }else{
                            return false;
                        }
                    }
                }
                i++;
            }
            return st.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(isValid(str) ? "Your brackets are balanced" : "Your brackets are not balanced");
    }
}
