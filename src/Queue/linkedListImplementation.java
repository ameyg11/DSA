package Queue;

public class linkedListImplementation {

    public static class Node{  // User define data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(){

        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node node = new Node(x);
            if(size == 0){
                head = tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }
        public void remove(){
            if(head == null){
                System.out.println("Queue is empty!");
                return;
            }else{
                head = head.next;
            }
        }
        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }else return false;
        }

    }

    public static void main(String[] args) {
        queueLL q = new queueLL();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();
        q.remove();
        q.add(5);
        q.print();

    }
}
