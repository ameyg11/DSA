package Stack;

public class linkedListImplementation {

    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node node = new Node(x);
            node.next = head;
            head = node;
            size++;
        }

        int pop(){
            if(head == null) {
                System.out.println("Bro stack is empty");
                return -1;
            }
            int poppedVal = head.val;
            head = head.next;
            size--;
            return poppedVal;
        }

        int peek(){
            if(head == null) {
                System.out.println("Bro stack is empty");
                return -1;
            }

            return head.val;
        }

        boolean isEmpty(){
            if(head == null) return true;
            else return false;
        }

        void displayRev(){
            Node temp=head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRec(Node head){
            if(head == null) return;
            displayRec(head.next);
            System.out.print(head.val + " ");
        }
        void display(){
            Node temp = head;
            displayRec(temp);
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(10);
        st.push(20);
        System.out.println("peeked value is : " +st.peek());
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Size of stack is : " +st.size);
//        st.displayRev();
        st.pop();
        System.out.println("Size of stack is : " +st.size);
        st.displayRev();
        st.display();
    }
}
