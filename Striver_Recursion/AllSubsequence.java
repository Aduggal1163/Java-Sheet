import java.util.*;

public class AllSubsequence {
    // AllSubsequence.java
    public static void print(int idx, int[] arr, List<Integer> list, int n)
    {
       if(idx==n)
       {
        for(int elt : list) System.out.print(elt);
        System.out.print(" ");
        return;
       }
       //take
       list.add(arr[idx]);
       print(idx+1,arr,list,n);
       //let go
       list.remove(list.size()-1);
       print(idx+1,arr,list,n);
    }
    public static void subsequence(int idx, char[] ch, List<Character> list, int n)
    {
        if(idx==n)
        {
            for(char elt : list) System.out.print(elt);
            System.out.print(" ");
            return;
        }
        //take
        list.add(ch[idx]);
        subsequence(idx+1,ch,list,n);
        //let go
        list.remove(list.size()-1);
        subsequence(idx+1, ch, list, n);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        // int n=3;
        // List<Integer> list=new ArrayList<>();
        // print(0,arr,list,n);
        String str="abc";
        char [] ch=str.toCharArray();
        int n=ch.length;
        List<Character> list=new ArrayList<>();
        subsequence(0,ch,list,n);
    }
}
