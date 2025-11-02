package LinkedList;

public class doublyLLimplementation {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertAtHead(int val){
            Node node = new Node(val);
            Node temp = node;
            if(head == null){
                head = node;
                tail = node;
            }else{
                temp.next = head;
                head.prev = temp;
                head = node;
            }
        }

        void insert(int val){
            Node node = new Node(val);
            Node temp = node;

            if(head == null){
                head = node;
                tail = node;
            }else{
                temp.prev = tail;
                tail.next = temp;
                tail = temp;
            }
        }

        int size(){
            Node temp = head;
            int size = 0;

            while(temp != null){
                temp=temp.next;
                size++;
            }

            return size;
        }

        void insertAtIdx(int val, int idx){
            Node temp = head;
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
            Node node = new Node(val);
            Node pointer = node;

            pointer.next = temp.next;
            pointer.prev = temp;
            temp.next.prev = pointer;
            temp.next = pointer;

        }

        void displayFromHead(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void  displayThroughTail(){
            Node temp = tail;

            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(9);
        ll.insertAtHead(1);

        ll.displayFromHead();
        ll.insertAtIdx(11, 2);
        ll.displayFromHead();
//        ll.displayThroughTail();
    }
}
