import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
          HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(30);
        set.add(60);
        set.add(6);
        for(int ele : set)
        {
            System.out.print(ele+" ");
        }
    }
}
