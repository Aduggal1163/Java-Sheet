public class palindrome {
    public static boolean palindrome(int n)
    {
        int p=n;
        int reverse=0;
        while(p!=0)
        {
            int ld=p%10;
            reverse=reverse*10+ld;
            p/=10;
        }
        if(n==reverse) return true;
        return false;
    }
    public static void main(String[] args) {
        int n=121;
        if(palindrome(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
