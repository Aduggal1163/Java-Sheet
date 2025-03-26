import java.util.*;
public class rangeprimeno {
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) 
            {
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("ENTER STARTING POINT: ");
        int start=sc.nextInt();
        System.out.print("ENTER ENDING POINT: ");
        int end=sc.nextInt();
       for(int i=start;i<=end;i++)
       {
        if(isPrime(i)) System.out.println(i);
       }
    }
}
