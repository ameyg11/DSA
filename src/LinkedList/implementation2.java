package LinkedList;

public class implementation2 {

    public static class Node{
        int data;
        Node next;

        public Node(int val){
            data = val;
        }
    }

    public static class linkedList{

        Node head =null;
        Node tail=null;

        public void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();

    }
}