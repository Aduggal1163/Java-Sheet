public class fibbonacci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
