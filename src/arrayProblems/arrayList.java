package arrayProblems;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //wrapper classes
        Integer ii = Integer.valueOf(4);
        System.out.println(ii);
        Float j = Float.valueOf(2.2f);
        System.out.println(j);

        //declaring element
        ArrayList <Integer> in = new ArrayList<>();

        //adding element
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        in.add(5);

        //get at element at index i
        System.out.println(in.get(1));  //2

        //print using for loop
//        for (int i=0; i<in.size(); i++){
//            System.out.print(in.get(i));
//        }

        //printing arrayList directly
        System.out.println(in);

        //adding element at some index i
        in.add(1,100);
        System.out.println(in);

        //modifing element at index i
        in.set(1,10);
        System.out.println(in); // [1, 10, 2, 3, 4, 5]

        //removing element at index i
        in.remove(1);
        System.out.println(in);


    }
}
