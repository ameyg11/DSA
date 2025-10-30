package LinkedList;

public class deleteMiddleElement {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void deleteElement(Node head){
        int size =0;
        Node fast = head;
        Node slow = head;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp = head;
        if(size % 2 == 0){
            while(fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return;
        }else{
            while(fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return;
        }
    }

    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(11);
        Node g = new Node(55);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        /*
        Node x = new Node(7);
        Node y = new Node(9);
        Node z = new Node(11);
        x.next = y;
        y.next = z;
        display(x);
        System.out.println();
        deleteElement(x);
        display(x);
        System.out.println();
        */

        display(a);
        System.out.println();
        deleteElement(a);
        display(a);
    }
}
