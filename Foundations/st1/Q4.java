package st1;

public class Q4 {
    public static void main(String[] args) {
        int n=5;
        int target=10;
        int arr[]={1,2,3,4,6};
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target && arr[i]!=arr[j])
                {
                    System.out.println(i+" "+j);
                    found=true;
                }
            }
        }
        if(!found)
        {
            System.out.println("No pairs found");
        }
    }
}
