package arrays;
public class strongNo {
    public static int factt(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int originalno=145;
        int n=originalno;
        int sum=0;
        while(n!=0)
        {
             int ld=n%10;
            
            sum+= factt(ld);
            n=n/10;
        }
        if(sum==originalno) System.out.println("STRING NUMBER");
        else System.out.println("NO");
    }
}
