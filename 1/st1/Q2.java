package st1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int totalSum=0;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                totalSum+=a;
                continue;
            }
            if(i==2)
            {
                totalSum+=b;
                continue;
            }
            sum=a+b;
            a=b;
            b=sum;
            totalSum+=sum;
        }
        System.out.println(totalSum);
    }
}
