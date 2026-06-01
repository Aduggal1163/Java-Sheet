import java.util.*;
public class sumEO {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumE=0;
        int sumO=0;
        while(n!=0)
        {
            int ld=n%10;
            if(ld%2==0){
                sumE=sumE+ld;
            }
            else
            {
                sumO=sumO+ld;
            }
            n=n/10;
        }
        System.out.println(sumE);
        System.out.println(sumO);
    }
}