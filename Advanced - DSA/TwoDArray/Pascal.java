package TwoDArray;

public class Pascal {
    public static void pascal(int n)
    {
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==0 || j == 0 || j==i) res[i][j]=1;
                else res[i][j]=res[i-1][j]+res[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pascal(n);
    }
}
