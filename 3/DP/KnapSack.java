class KnapSack{
    public static int profit(int idx, int[] val, int[] wt, int c, int[][] dp)
    {
        if(idx==val.length) return 0;
        if(dp[idx][c]!=-1) return dp[idx][c];
        int skip = profit(idx+1, val, wt, c,dp);
        if(wt[idx]>c) return dp[idx][c]=skip;
        int take = val[idx] + profit(idx+1, val, wt,c-wt[idx],dp);
        return dp[idx][c]=Math.max(skip,take);
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