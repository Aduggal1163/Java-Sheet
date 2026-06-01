package st1;
import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int n=5;
        int [] arr={3,2,4,6,5};
        ArrayList<Integer>aList=new ArrayList<>();
        aList.add(arr[0]);
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<temp)
            {
                aList.add(arr[i]);
                temp=arr[i];
            }
        }
        for(int i=0;i<aList.size();i++)
        {
            System.out.print(aList.get(i)+" ");
        }
    }
}