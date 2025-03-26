import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int n=arr.length;
        int res[]=new int[arr.length];
        // for(int i=0;i<n;i++)
        // {
        //     res[i]=-1;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[j]>arr[i])
        //         {
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0;i<res.length;i++)
        // {
        //     System.out.print(res[i]+" ");
        // }
        ////using stacks
        
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]>st.peek()) st.pop();
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
