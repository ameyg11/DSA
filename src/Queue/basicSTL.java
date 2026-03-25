package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> r = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        while(q.size() > 0){

            System.out.print(q.remove() + " ");
//            q.remove();
        }
    }
}
