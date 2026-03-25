
import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.length()<=10){
            System.out.print(str);
        }else{
            int length = str.length()-2;
            char f = str.charAt(0), l= str.charAt(str.length()-1);
            System.out.println( f + length + l);
            System.out.println(str.charAt(0));
        }
    }
}
