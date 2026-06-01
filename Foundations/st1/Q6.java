package st1;
public class Q6 {
    public static void main(String[] args) {
       int arr[]={1234,4321,1243};
       int n=arr.length;
       int smallThousand=Integer.MAX_VALUE;
       int largeHundreds=Integer.MIN_VALUE;
       int smallTens=Integer.MAX_VALUE;
       int largeOnce=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
        int thousand=arr[i]/1000;
        int hundred=(arr[i]%1000)/100;
        int tens=(arr[i]%100)/10;
        int once=arr[i]%10;
        if(thousand<=smallThousand)
        {
            smallThousand=thousand;
        }
        if(largeHundreds<=hundred)
        {
            largeHundreds=hundred;
        }
        if(tens<=smallTens)
        {
            smallTens=tens;
        }
        if(once>=largeOnce)
        {
            largeOnce=once;
        }
    }
    System.out.print(smallThousand);
    System.out.print(largeHundreds);
    System.out.print(smallTens);
    System.out.print(largeOnce);
    }

}