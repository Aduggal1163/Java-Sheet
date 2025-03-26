package MooreAlgorithm;
import java.util.*;
// majority elt should occur more then n/2 times
public class MajorityElt {
    public static int Moores(int[] nums){
        int freq=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(freq==0)
            {
                ans=nums[i];
            }
            if(ans==nums[i])
            {
                freq++;
            }
            else freq--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,1,1,2,2,2,3};
        // Arrays.sort(nums);
        int m=nums.length;
        // int freq=1;
        // int ans=nums[0];
        // for(int i=1;i<m;i++)
        // {
        //     if(nums[i]==nums[i-1])
        //     {
        //         freq++;
        //     }
        //     else
        //     {
        //         freq=1;
        //         ans=nums[i];
        //     }
        //     if(freq>m/2) System.out.print(nums[i]);
        // }
        System.out.println(Moores(nums));
    }
}
