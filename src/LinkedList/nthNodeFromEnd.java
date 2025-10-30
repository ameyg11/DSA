package LinkedList;

public class nthNodeFromEnd {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static Node nthNode(Node head, int n){
        Node temp = head;
        int size=0;

        while(temp!= null){
            size++;
            temp = temp.next;
        }

        temp=head;

        for(int i=0; i< size-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return temp;
    }

    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node nthNode3(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

//        Node temp = nthNode(a, 3);
//        System.out.println(temp.val);
        Node temp = nthNode3(a, 2);
        System.out.println(temp.val);
        display(a);

    }
}
