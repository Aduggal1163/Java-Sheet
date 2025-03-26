public class palindrome {
    public static void isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        char chars[]=s.toCharArray();
        while(i<j)
        {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;j--;
        }
        if(new String(s).equals(s)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        String s="madam";
        isPalindrome(s);
    }
}
