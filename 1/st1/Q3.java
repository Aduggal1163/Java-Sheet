package st1;
import java.util.*;
public class Q3 {
    public static int sol(int tickets[])
    {
    int n = tickets.length;
        int max=0;
        for(int ticket:tickets)
        {
            if(ticket>max)
            max=ticket;
        }
        int freq[]=new int[max+1];
        int m=freq.length;
        for(int ticket:tickets)
        {
            if(ticket<=max)
            {
                freq[ticket]++;
            }
        }
        int largestValid=-1;
        for(int i=0;i<m;i++)
        {
            if(freq[i]==i)
            {
                largestValid=i;
            }
        }
        return largestValid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tickets[]=new int[n];
        for(int i=0;i<n;i++)
        {
            tickets[i]=sc.nextInt();
        }
        int result=sol(tickets);
        System.out.println(result);
    }
}
