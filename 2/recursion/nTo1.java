public class nTo1 {
    public static void nTo1(int n)
    {
        if(n<1) return;
        System.out.print(n+" ");
        nTo1(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        nTo1(n);
    }
}
