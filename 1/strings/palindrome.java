package strings;
import java.util.*;
public class palindrome {
    public static boolean ispalindrome(String str)
    {
            int n=str.length();
            for(int i=0;i<=n/2;i++)
            {
                if(str.charAt(i)!=str.charAt(n-i-1)) return false;
            }
            return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        if(ispalindrome(str)){
            System.out.println("YES");
        }
        else
        System.out.println("NOO");
    }
}
