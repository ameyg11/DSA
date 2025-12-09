package Stack;

import java.util.Stack;

public class infixExpression {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            // '0' -> 48 && '9' -> 57
            if(ascii >= 48 && ascii <= 57)val.push(ascii-48);
            else if(op.size() == 0) op.push(ch);
            else {
                if(ch == '-' || ch == '+'){
                    // work
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                    // push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }

        while(val.size() > 1){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek() == '+') val.push(val1 + val2);
            if(op.peek() == '-') val.push(val1 - val2);
            if(op.peek() == '*') val.push(val1 * val2);
            if(op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
