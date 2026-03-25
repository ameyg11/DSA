package Queue;

public class arrayImplementation {

    public static class queueA{
        int f = -1;
        int r = -1;
        int[] arr = new int[100];
        int size = 0;

        public void add(int val){
            if(r == arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f == -1){
                f = 0;
                r = 0;
                arr[r] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(f == -1){
                System.out.println("Queue is empty");
                return -1;
            }else{
                f++;
                size--;
                return arr[f-1];
            }
        }
        public int peek(){
            return arr[f];
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();

        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
