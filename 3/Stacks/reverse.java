import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }
        for(int i=0;i<st.size();i++)
        {
            System.out.print(st.get(i)+" ");
        }
    }
}
