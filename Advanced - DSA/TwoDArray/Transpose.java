package TwoDArray;

public class Transpose {
    public static void main(String[] args) {
        int mat[][]={
            {1, 2, 3},
            {4, 5, 6}
        };
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
