package arrayProblems;
import java.util.ArrayList;
import java.util.Collections;

class arrayLst{
    static void reverseArray(ArrayList<Integer> array){
        int i = 0 , j = array.size()-1;

        while(i < j){
            Integer temp = Integer.valueOf(array.get(i));
            array.set(i,array.get(j));
            array.set(j,temp);
            i++;
            j--;
        }
    }
}

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

        //removing an element e
        in.remove(Integer.valueOf(3));
        System.out.println(in);

        ArrayList <Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        System.out.println("Original list" +array);

        arrayLst.reverseArray(array);

        System.out.println("Reversed List" +array);

        Collections.reverse(array);
        System.out.println("Collection reversed list" +array);




    }
}
