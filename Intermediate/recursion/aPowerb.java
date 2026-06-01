public class aPowerb {
    // public static int pow(int a, int b) TC=O(b)
    // {
    //     if(a==0) return 0;
    //     if(b==0) return 1;
    //     return a*(pow(a,b-1)); // 2*2 power4 2*2power3 so on...
    // }
    ///optimised approach TC O(log b)
    public static int pow(int a, int b)
    {
        if(b==0) return 1;
        int ans=pow(a,b/2);
        if(b%2==0)
        {
             return ans*ans;
        }
        return ans=a*ans*ans;
        
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int p=pow(a,b);
         System.out.println(p);
    }
}
