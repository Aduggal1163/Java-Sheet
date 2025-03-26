package TwoDArray;

public class Spiral {
    public static void print(int [][] arr)
    {
        int m=arr.length;
        int n=arr[0].length;
        int sr=0;
        int er=m-1;
        int sc=0;
        int ec=n-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                System.out.print(arr[sr][i]+" ");
            }
            for(int i=sr+1;i<=er;i++)
            {
                System.out.print(arr[i][ec]+" ");
            }
            for(int i=ec-1;i>=sc;i--)
            {
                if(sr==er)break;
                System.out.print(arr[er][i]+" ");
            }
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)break;
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,19},
        };
            print(arr);
    }
}
