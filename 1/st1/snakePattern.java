package st1;
public class snakePattern {
    public static void print(int [][]arr) {
            int n=arr.length;
            int m=arr[0].length;
           for(int i=0;i<n;i++)
           {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
           }
    }
    public static void main(String[] args) {
        int mat[][]=new int[][]{
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50} };
            print(mat);

    }
}
