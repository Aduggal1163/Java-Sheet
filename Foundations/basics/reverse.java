import java.util.*;
public class reverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER: ");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println("REVERSED NO IS: "+ rev);
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        //     i=i+2;
        // }
    }
}