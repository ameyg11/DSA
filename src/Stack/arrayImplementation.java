package Stack;

public class arrayImplementation {

    public static class Stack{
        private int[] arr = new int[10];
        private int idx = 0;

        void push(int x){
            if(idx >= arr.length) {
                System.out.println("Stack is full");
                return; 
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("bro stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop(){
            if(idx == 0){
                System.out.println("there is no one in stack : just like your life");
                return -1;
            }
            idx--;
            return arr[idx];
        }

        void display(){
            for (int i=0; i<idx; i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull(){
            if (idx == arr.length) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty() ? "Stack is empty" : "No stack is not empty");
        System.out.println("size is " +st.size());
        st.push(10);
        st.push(20);

        System.out.println(st.isEmpty() ? "Stack is empty" : "No stack is not empty");
        System.out.println("size is " +st.size());
        st.display();
        System.out.println(st.pop());
        st.display();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
