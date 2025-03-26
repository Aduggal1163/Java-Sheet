import java.util.HashMap;

public class basicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("two",11);
        map.put("six",3);
        // System.out.println(map);
        // System.out.println(map.get("one"));
        // System.out.println(map.containsKey("two"));
        for(String key : map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}
//lc 242 1 120 1497 1814 138