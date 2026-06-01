class stairPath{
    //find no of ways to reach nth stair if at a time one or two jump at stairs are allowed
    public static int ways(int n)
    {
        if(n==0||n==1) return 1;
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) {
        int nstair=5;
        int ans=ways(nstair);
        System.out.println("No of ways to reach "+nstair+"th stair is "+ans);
    }
}