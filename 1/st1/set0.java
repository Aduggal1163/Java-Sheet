package st1;
import java.util.Arrays;
public class set0 {
    public static void sol(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        int rowArray[]=new int[n];
        int colArray[]=new int[m];
        Arrays.fill(rowArray,1);
        Arrays.fill(colArray,1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    rowArray[i]=0;
                    colArray[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rowArray[i]==0 || colArray[j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3},
                     {4, 0, 6},   
                    {7, 8, 9} };
            sol(arr);
    }
}
