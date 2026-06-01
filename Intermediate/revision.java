// "static void main" must be defined in a public class.
public class Main {
    public static void btd(int no)
    {
        int bNum=0;
        int pow=0;
        while(no!=0)
        {
            int rem=no%10;
            bNum+=rem*((int)Math.pow(2,pow));
            pow++;
            no/=10;
        }
        System.out.print(bNum);
    }
    public static void dtb(int n)
    {
        int dNum=0;
        int pow=0;
        while(n!=0)
        {
            int rem=n%2;
            dNum+=rem*((int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.print(dNum);
    }
    public static void rev(int num)
    {
        int reverse=0;
       while(num!=0)
       {
           int ld=num%10;
           reverse=reverse*10+ld;
           num/=10;
       }
        System.out.print(reverse);
    }
    public static void rev(int [] arr)
    {
        int n=arr.length;
       int i=0;
        int j=n-1;
        while(i<=j)
        {
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
             i++;
             j--;
        }
        
    }
    public static void rev(int arr[] , int i, int k)
    {
        int n=arr.length;
        while(i<=k)
        {
            int swap=arr[i];
            arr[i]=arr[k];
            arr[k]=swap;
             i++;
             k--;
        }
    }
    public static boolean pal(int n)
    {
        int no=n;
        int rev=0;
        while(n!=0)
        {
            int ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        return no==rev;
    }
    public static void fact(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
    public static void nfibbo(int n)
    {
        int a=1;
        int b=1;
        int sum=0;
        for(int i=1;i<n-1;i++)
        {

            sum=a+b;
            a=b;
            b=sum;
        }
                    System.out.print(b+" ");
    }
    public static void fibbo(int n)
    {
        int a=1;
        int b=1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
    public static boolean isPrime(int n)
    {
        boolean ans=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                ans=false;
                break;
            }
        }
        if(ans) return true;
        else return false;
    }
    public static void rangePrime(int m, int n)
    {
        for(int i=m;i<=n;i++)
        {
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
    public static boolean armstrong(int n)
    {
        int temp=n;
        int sum=0;
        int noOfDigits=String.valueOf(n).length();
        while(temp!=0)
        {
            int ld=temp%10;
            sum+=Math.pow(ld,noOfDigits);
            // sum+=Math.pow(ld,3);
            temp/=10;
        }
        return sum==n;
    }
    public static void armR(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(armstrong(i)) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int no=100;
        int n=10;
        int number=10;
        int arm=371;
        armR(9999);
        System.out.println();
        if(armstrong(arm)) System.out.print("Yes");
        else System.out.print("No");
        System.out.println();
        rangePrime(2,10);
        System.out.println();
        if(isPrime(n)) System.out.print("Yes");
        else System.out.print("No");
           System.out.println();
        fibbo(number);
           System.out.println();
        nfibbo(number);
        System.out.println();
        dtb(n);
        System.out.println();
        fact(n);
        System.out.println();
        btd(no);
        System.out.println();
        int num=123;
        rev(num);
        System.out.println();  
        if(pal(num)) System.out.print("Yes");
        else System.out.print("No");
        System.out.println();  
        int arr[]={5,6,7,8,9,10};
        rev(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k=2;
        int n1=arr.length;
        if(k>n) k=k%n;
        rev(arr,0,n1-k-1);
        rev(arr,n1-k,n1-1);
        rev(arr,0,n1-1);
         for(int i=0;i<n1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}