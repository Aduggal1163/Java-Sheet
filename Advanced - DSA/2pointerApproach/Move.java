// move even int to the beginning of the array and odd to last
public class Move {
    class Solution {
        public void swap(int arr[], int i, int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public int[] sortArrayByParity(int[] arr) {
            int n=arr.length;
            int i=0;
            int j=n-1;
            while(i<j)
            {
                if(arr[i]%2!=0 && arr[j]%2==0)
                {
                    swap(arr,i,j);
                    i++;
                    j--;
                }
                if(arr[i]%2==0) i++;
                if(arr[j]%2!=0) j--;
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sortArrayByParity(arr));
    }
}
