import java.util.*;
public class nocount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        System.out.print("Enter no you want count of excluing: ");
        int m=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int ld=n%10;
            if(ld!=m)count++;
            n=n/10;
        }
        System.out.println(count);
    }
}