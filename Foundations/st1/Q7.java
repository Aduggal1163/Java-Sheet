package st1;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(num1%arr[i]==0 && num2%arr[i]==0)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
