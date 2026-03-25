package Queue;

import java.util.Arrays;

public class carrayImplementation {

    public static class cArray{
        int f = -1;
        int r = -1;
        int[] arr = new int[6];
        int size = 0;

        public void add(int val) throws Exception{
            if(size == 0){
                f = r = 0;
                arr[0] = val;
            }else if (size == arr.length){
                throw new Exception("Queue is full");
            }else if(r<arr.length-1){
                 arr[++r] = val;
            }else if(r == arr.length-1){
                r = 0;
                arr[r] = val;
            }
            size++;
        }

        public int remove(){
            int value = arr[f];
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            } else if (f < arr.length-1) {
                f++;
            } else if (f == arr.length-1) {
                f = 0;
            }
            size--;
            return value;                     // check this is correct or not
        }

        public int peek(){
            if(r > 0){
                return arr[r];
            }else{
                System.out.println("Queue is empty");
                return -1;
            }
        }

         public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            if(f<=r){
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + ", ");
                }
            }else{
                for(int i=f; i<arr.length; i++){
                    System.out.print(arr[i] + ", ");
                }
                for(int i=0; i<r; i++){
                    System.out.print(arr[i] + ", ");
                }
            }
             System.out.println();
         }
    }

    public static void main(String[] args) throws Exception{
        cArray arr = new cArray();

        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(9);
        arr.display();
        System.out.println(arr.size);
        arr.remove();
        arr.remove();
        arr.remove();
        System.out.println(arr.size);
        arr.remove();
        System.out.println(arr.size);
    }
}
