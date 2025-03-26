public class gcd {
    public static int gcdsss(int a, int b)
    {
        while(true)
        {
            if(b>a)b=b-a;
            else a=a-b;
            if(a==0||b==0) break;
        }
        return a+b;
        // OR if(b%a==0) return a;
        // return gcdsss(b%a, a);
    }
 public static void main(String[] args) {
    int n=3;
    int m=10;
    System.out.println(gcdsss(n,m));
 }   
}
