package LinkedList;

public class reverseLinkedList {

    public static class Node{
        int val;
        Node next;

        public Node(int data){
            this.val = data;
        }

    }
    static void  display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }


    public static void disRev(Node head){
        if(head == null) return;

        disRev(head.next);
        System.out.print(head.val + " ");
    }
    
    public static void main(String[] args) {
         Node a = new  Node(4);
         Node b = new  Node(5);
         Node c = new  Node(7);
         Node d = new  Node(3);
         Node e = new  Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();
        disRev(a);
    }
}
