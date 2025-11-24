package Stack;

import java.util.Scanner;
import java.util.Stack;

public class _01BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i < str.length()){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push('(');                          // st.push(char);
            }else if (ch == ')' && !st.isEmpty()){
                st.pop();
            }else if (ch == ')' && st.isEmpty()){
                return false;
            }
            i++;
        }
        if(!st.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(isBalanced(str) ? "Your brackets are balanced" : "Your brackets are not balanced");
    }
}
