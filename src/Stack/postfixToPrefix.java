package Stack;

import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();

        for(int i=0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(String.valueOf(ch));
            }else{
                String val2 = val.pop();
                String val1 = val.pop();
                val.push(ch + val1 + val2 );
            }
        }
        System.out.println(val.peek());
    }
}
