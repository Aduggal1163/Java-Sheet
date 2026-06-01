package TWOdarray;

public class searchinSortedMatrix {
    public static boolean ans(int arr[][],int key)
    {
            int row=0;
            int col=arr.length-1;
            while(row<arr.length && col>=0)
            {
                if(arr[row][col]==key)
                {
                System.out.println("KEY FOUND ("+row+","+col+")");
                return true;
                }
                else if(key<arr[row][col])
                {
                     col--;
                }
                else 
                    row++;
            }
            System.out.println("NOT");
            return false;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,19},
        };
        int key=10;
        ans(arr, key);
    }
}
