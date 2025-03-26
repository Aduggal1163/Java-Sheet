public class generateParanthesis {
    // public static void generate(int open, int close, String s, int n)
    // {
    //     if(s.length()==2*n)
    //     {
    //         System.out.println(s);
    //         return;
    //     }
    //     if(open<n) generate(open+1, close, s+'(', n);
    //     if(close<open) generate(open, close+1, s+')', n); 
    // }
    public static void generate(int close, int open, String s, int n)
    {
        if(s.length()==2*n)
        {
            System.out.println(s);
            return;
        }
        if(open<n) generate(close, open+1, s+'(', n);
        if(close<open) generate(close+1, open, s+')', n);
    }
    public static void main(String[] args) {
        int n=3;
        generate(0,0,"",n);            
    }
}
