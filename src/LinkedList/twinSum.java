package LinkedList;

public class twinSum {
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

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static int sum(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node temp2 = newHead;
        Node temp = head;
        slow.next = null;
        int max = Integer.MIN_VALUE;
        while(temp != null){
            if(temp.data + temp2.data > max){
                max = temp.data + temp2.data;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }

        return max;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.out.println();
        int ans = sum(a);
        System.out.println(ans);
    }
}
