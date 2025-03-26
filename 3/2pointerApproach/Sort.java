public class Sort {
        //sort array containing 0 and 1
        public static void BruteForce(int arr[], int count0, int count1)
        {
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)count0++;
                else
                count1++;
            }
            for(int i=0;i<count0;i++)
            {
                arr[i]=0;
            }
            for(int i=count0;i<n;i++)
            {
                arr[i]=1;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        public static void swap(int array[],int i, int j)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        public static void main(String[] args) {
            int[] arr = {1, 0, 1, 0, 1, 1};
            int count0=0;
            int count1=0;
            int n=arr.length;
            BruteForce(arr,count0,count1);
            System.out.println();
            // now using two pointers
            int array[]={1,0,0,1,1,1,0,0,1};
            int i=0;
            int j=array.length-1;
            while(i<j)
            {
                if(array[i]==1 && array[j]==0)
                {
                    swap(array,i,j);
                    i++;
                    j--;
                }
                 if(array[i]==0) i++;
                if(array[j]==1) j--;
            }
            for(int a=0;a<array.length;a++)
            {
                System.out.print(array[a]+" ");
            }
        }
}
