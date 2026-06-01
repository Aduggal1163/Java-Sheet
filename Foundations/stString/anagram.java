import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str="one";
        String str1="Neo";
        char chars[]=str.toCharArray();
        Arrays.sort(chars);
        char chars1[]=str1.toCharArray();
        Arrays.sort(chars1);
        String s=new String(chars);
        String s1=new String(chars1);
        if(s.equals(s1)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
