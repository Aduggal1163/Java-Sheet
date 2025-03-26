public class OneToN {
    public static void OneToN(int n)
    {
        if(n<1) return;
        OneToN(n-1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        int n=10;
        OneToN(n);
    }
}
