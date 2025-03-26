package TwoDArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},
        {5,6,7},
        {9,10,11},
        };
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==j || i+j==arr[0].length-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
