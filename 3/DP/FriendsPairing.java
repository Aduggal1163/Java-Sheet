import java.util.*;
class FriendsPairing{
    public static int pair(int n,int dp[])
    {
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = pair(n-1,dp)+(n-1)*pair(n-2,dp);
    }
    public static void main(String[] args) {
        int n=4;
        int [] dp= new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
}