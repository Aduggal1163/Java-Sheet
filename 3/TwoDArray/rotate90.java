package TwoDArray;
public class rotate90 {
    public static void rotateClockwise(int[][] arr)
    {
        int m=arr.length;
        int n=arr[0].length;
        int res[][]=new int[m][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m;i++)
        {
            int left=0;
            int right=m-1;
            int temp=res[i][left];
            res[i][left]=res[i][right];
            res[i][right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotateAnticlockwise(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        int res[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            res[i][j]=arr[j][i];
            }
        }
        
        for(int i=0;i<m;i++)
        {
            int top=0;
            int bottom=m-1;
            while(top<bottom)
            {
                int temp=res[top][i];
                res[top][i]=res[bottom][i];
                res[bottom][i]=temp;
                top++;
                bottom--;
            }
        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        rotateClockwise(arr);
        rotateAnticlockwise(arr);
    }
}