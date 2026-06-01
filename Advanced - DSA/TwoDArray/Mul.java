package TwoDArray;

public class Mul {
    public static void main(String[] args) {
        int mat1[][]={
            {1, 2, 3},
            {4, 5, 6}
        };
        int mat2[][]={
            {7, 8},
            {9, 10},
            {11, 12}  
        };
        int m1=mat1.length;
        int n1=mat1[0].length;
        int m2=mat2.length;
        int n2=mat2[0].length;
        int arr[][]=new int[m1][n2];
        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<n1;k++)
                {
                    arr[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }   
    }
}
