public class SubsetSum {
    public static boolean subset(int i, int sum, int[] arr, int target)
    {
        if(i>arr.length)
        {
            if(sum == target) return true;
            else
            return false;
        }
        boolean take=subset(i+1, target-sum, arr, target);
        boolean skip=subset(i+1, sum, arr, target);
        return take || skip;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5};
        int target = 9;
        System.out.println(subset(0,0,arr,target));
    }
}
