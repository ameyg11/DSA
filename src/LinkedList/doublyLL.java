package LinkedList;

public class doublyLL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    static void displayFromHead(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void  displayThroughTail(Node tail){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void displayFromAnyWhere(Node node){
        Node temp = node;

        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

//        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
//        f.next = null;

        displayFromHead(a);
        displayThroughTail(f);
        displayFromAnyWhere(d);

    }
}
