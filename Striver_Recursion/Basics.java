public class Basics {
    static int count=1;
    public static void PrintName5Times(int n){
        if(count>n)return;
        System.out.print("ASDASK"+" ");
        count++;
        PrintName5Times(n);
    }
    public static void Print1ToN(int n, int i)
    {
        if(n<1)return;
        System.out.print(i+" ");
        i++;
        n--;
        Print1ToN(n, i);
    }
    public static void PrintNto1(int n)
    {
        if(n<1)return;
        System.out.print(n+" ");
        n--;
        PrintNto1(n);
    }
    public static void SumFirstN(int n, int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
        SumFirstN(n-1,sum+n);
    }
    public static int SumFirstN(int n)
    {
        if(n<1) return n;
        return n+SumFirstN(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        PrintName5Times(n);
        System.out.println();
        Print1ToN(n,1);
        System.out.println();
        PrintNto1(n);
        System.out.println();
        int sum=0;
        SumFirstN(n,sum);
        System.out.println(SumFirstN(5));
    }
}
