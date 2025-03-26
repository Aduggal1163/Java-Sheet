package arrays;

public class trappedrainwater {
    public static int sol(int height[])
    {
        int n=height.length;
        //cal left max boundary---array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        //cal right max boundary---array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        //loop
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
        //water level=min(leftmax boundary,rightmax boundary)
           int waterLevel=Math.min(leftmax[i],rightmax[i]);
        //trapped rain water=water level-height[i]
           trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(sol(height));
    }
}
