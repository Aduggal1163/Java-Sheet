public class fibbo {
    public static int fibbo(int n)
    {
        if(n==0 || n==1) return n;
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        int ans=fibbo(n);
        System.out.println(ans);
    }
}
