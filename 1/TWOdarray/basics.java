package TWOdarray;
import java.util.*;
public class basics {
    public static boolean search(int arr[][],int key) {
        int n=arr.length;
       int  m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==key) {
                    System.out.print("KEY FOUND AT INDEX= ("+i+" "+j+")");
                    return true;
                }
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        n=mat.length;
        m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("ENTER YOUR KEY: ");
        int key=sc.nextInt();
       search(mat, key);
    }
}
