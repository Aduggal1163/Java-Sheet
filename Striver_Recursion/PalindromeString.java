public class PalindromeString {
    public static boolean isPalindrome(String str, int i, int j)
    {
        if(i>=j)return true;
        if(str.charAt(i)!=str.charAt(j))return false;
        return isPalindrome(str, i+1, j-1);
    }
    public static void main(String[] args) {
        String str="aba";
        if(isPalindrome(str,0,str.length()-1)) System.out.println("YES");
        else System.out.println("NO");
    }
}
