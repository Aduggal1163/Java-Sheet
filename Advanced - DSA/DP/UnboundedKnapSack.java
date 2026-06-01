class UnboundedKnapSack{
    public static int profit(int i, int[] val, int[] wt, int c, int[][] dp)
    {
        if(i==wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip=profit(i+1, val, wt, c, dp);
        if(wt[i]>c) return dp[i][c]=skip;
        int taken=val[i]+profit(i, val, wt, c-wt[i], dp);
        return dp[i][c]=Math.max(skip,taken);
    }
    public static void main(String[] args) {
        int [] val={5,3,7,16};
        int [] wt={1,2,8,10};
        int capacity=8;
        int n=wt.length;
        // idx 0 to n-1 | c=c to 0
        int [][] dp=new int[n][capacity+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(profit(0, val, wt, capacity, dp));
    }
}