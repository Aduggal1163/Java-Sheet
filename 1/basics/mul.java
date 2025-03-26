import java.util.*;
public class mul
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+" X "+i+" = "+(n*i));
        // }
        for(int i=1;i<=10;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" X "+i+" = "+(j*i)+ "\t");
            }
            System.out.println();
        }
    }
}
