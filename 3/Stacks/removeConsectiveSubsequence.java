import java.util.*;
class removeConsectiveSubsequence{
    public static int[] remove(int[] arr)
    {
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else
            {
                if(i==n-1 || arr[i]!=arr[i+1])st.pop();
            }
        }
        int res[]=new int[st.size()];
        for(int i =st.size()-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;

    }
    static int[] remov(int [] arr)
    {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty() || arr[i]!=st.peek()) st.push(arr[i]);
            else
            {
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int res[]=new int[st.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=st.pop();
            // System.out.print(res[i]+" ");
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,10,4,4,4,4,4,4,6,6,6,6,6,6,2,6};
        int[] res=remov(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}