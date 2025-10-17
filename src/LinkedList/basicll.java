package LinkedList;

public class basicll {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void display(Node a){
        Node temp = a;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayR(Node head){
        if(head == null) return;

        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void displayReverse(Node head){
        if(head == null) return;

        displayR(head.next);
        System.out.print(head.data + " ");

    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(3);
        Node e = new Node(16);

        /*
        System.out.println(a);      // LinkedList.basicll$Node@7b23ec81
        System.out.println(a.next); // null
        a.next = b;
        System.out.println(b);      // LinkedList.basicll$Node@6acbcfc0
        System.out.println(a.next); // LinkedList.basicll$Node@6acbcfc0
        System.out.println(a.next.data);  // 5 - data of b
        */
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayR(a);

//        Node temp = a;
//        for(int i=0; i<5; i++){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

    }
}
