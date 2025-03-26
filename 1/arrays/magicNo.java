package arrays;
import java.util.*;
public class magicNo {
    public static void main(String args[])
    {
        int n=50113;
        int sum=0;
        while(n!=0)
        {
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        int sumO=0;
        if(sum>=10)
        {
            while(sum!=0)
            {
                int ld=sum%10;
                sumO+=ld;
                sum/=10;
            } 
        }
        if(sumO==1) System.out.println("TRUE");
        else{
            System.out.println("False");
        }
    }
}
