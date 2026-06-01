import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        // System.out.println(set); 
        System.out.println(set.contains(10));
        set.remove(-8);
        System.out.println(set);
        //set to array
        Object[] arr=set.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
//lc 2442 2744