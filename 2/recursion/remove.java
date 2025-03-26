public class remove {
    // remove all occurance of a using recursion
    // public static void solve(int i, String str,String ans)
    // {
    //     if(i>=str.length()) 
    //     {
    //         System.out.print(ans+" ");
    //         return;
    //     }
    //     if(str.charAt(i)!='a') ans+=str.charAt(i);
    //     solve(i+1, str,ans);
    // }
    public static void solve(int i, String str, String s)
    {
        if(i==str.length())
        {
            System.out.println(s);
            return;
        }
        if(str.charAt(i)!='a')
        {
            s+=str.charAt(i);
        }
        solve(i+1,str,s);
    }
    public static void main(String[] args) {
        String str="abhishek haiga ma";
        solve(0,str,"");
    }
}
