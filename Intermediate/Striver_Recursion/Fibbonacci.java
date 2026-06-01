public class Fibbonacci {
    public static int fibboo(int n)
    {
        if(n<=1) return n;
        return fibboo(n-1)+fibboo(n-2);
    }
    public static void fibbo(int n, int a, int b)
    {
        if(n==0)return;
        System.out.print(a+" ");
        fibbo(n-1,b,a+b);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibboo(n));
        fibbo(n,0,1);
    }
}
