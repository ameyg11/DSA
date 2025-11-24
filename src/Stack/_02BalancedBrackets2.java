package Stack;
// Find the minimum number of brackets that we need to
//remove to make the given bracket sequence balanced.

import java.util.Scanner;
import java.util.Stack;

public class _02BalancedBrackets2 {

    public static int isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i < str.length()){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push('(');                          // st.push(char);
            }else if (ch == ')' && !st.isEmpty()){
                st.pop();
            }else if (ch == ')' && st.isEmpty()){
                while(i < str.length()){
                    if(ch == '('){
                        st.push('(');                          // st.push(char);
                    }
                    i++;
                }
            }
            i++;
        }
        return st.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(" minimum number of brackets that we need to remove to make the given bracket sequence balanced are : " +isBalanced(str));
    }
}
