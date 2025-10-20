package LinkedList;

public class implementation {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next =  temp;
            }
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);

            if(head == null){         // ll is empty
                head = temp;
                tail = temp;
            }else {                   // ll is not-empty
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIdx(int idx, int val){
            Node temp = new Node(val);
            int size=size();
            if(idx>size-1){
                insertAtEnd(val);
                return;
            }
            if(idx == 0){
                insertAtHead(val);
                return;
            }

            Node pointer = head;
            for(int i=0; i<size; i++){
                if(i == idx-1){
                    temp.next = pointer.next;
                    pointer.next = temp;
                    break;
                }else{
                    pointer = pointer.next;
                }
            }
        }

        void deleteAt(int idx){
            Node temp = head;
            Node prev = temp;
            for(int i=0; i<=idx-1; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }

        int getEle(int idx){
            Node temp=head;
            for(int i=0; i<=idx; i++){
                if(i == idx){
                    return temp.data;
                }else {
                    temp = temp.next;
                }
            }
            return -1;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(12);
        ll.insertAtHead(36);
        ll.display();
        System.out.println();
        ll.insertAtIdx(1,10);
        ll.display();
        System.out.println();
        ll.insertAtIdx(0, 1);
        ll.insertAtIdx(6, 99);
        ll.display();
        System.out.println();
//        System.out.println(ll.getEle(4));
        ll.deleteAt(3);
        ll.display();

    }
}