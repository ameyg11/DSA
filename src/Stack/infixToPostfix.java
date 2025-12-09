package Stack;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) val.push(String.valueOf(ch));
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x = op.pop();
                    val.push(v1+v2+x);
                }
                op.pop();
            }else{
                if(ch == '+' || ch == '-'){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x = op.pop();
                    val.push(v1+v2+x);
                    // push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char x = op.pop();
                        val.push(val1 + val2 + x);
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char x = op.pop();
            val.push( val1 + val2 + x);
        }
        System.out.println(val.peek());
    }
}
