package strings;

import java.util.Arrays;

// anagram.java
public class anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        if(str1.length()==str2.length())
        {
            char arr1[]= str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result=Arrays.equals(arr1,arr2);
            if(result) System.out.println("YES");
            else System.out.println("NO");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
