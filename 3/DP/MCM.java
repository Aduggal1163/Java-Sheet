class MCM{
    public static int mcm(int i , int j, int arr[], int [][] dp)
    {
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int x=arr[i] * arr[j+1] * arr[k+1];
            int totalCost=mcm(i,k,arr, dp)+mcm(k+1,j,arr, dp)+x;
            minCost=Math.min(minCost,totalCost);
        }
        return dp[i][j]=minCost;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int n=arr.length;
        int[] []dp=new int[n][n];
         for(int i=0;i<dp.length;i++)for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        System.err.println(mcm(0,n-2,arr, dp));
    }
}