package arrays;
public class buyandsellstocks {
    public static int sol(int [] prices)
{
    int n=prices.length;
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<n;i++)
    {
       if(buyPrice<prices[i])
       {
        int profit=prices[i]-buyPrice;
        maxProfit=Math.max(maxProfit,profit);
       }
       else
       {
        buyPrice=prices[i];
       }
    }
    return maxProfit;
}
    public static void main(String[] args) {
        int prices[]={1,2,3,4,5,6};
        System.out.println(sol(prices));
    }
}
