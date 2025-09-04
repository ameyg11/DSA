package commonQue;
import java.util.*;

public class hashMap1 {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();

        map.put("amey", 11);
        map.put("tejas", 12);
        map.put("siddesh", 10);

        System.out.println(map.get("amey"));
        System.out.println(map.containsValue(11));

        // mostly recommended
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }

        // 2nd way to iterate

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.print(" " + key + " " +map.get(key));
        }

        // removing any key

        map.remove("siddesh");
        System.out.print(map);

    }
}
