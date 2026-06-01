import java.util.*;
public class arrayList {
    // arrayList.java
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(10);
        // list.add(63);
        // System.out.println(list);
        for( int i=0;i<6;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i=0;i<6;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
