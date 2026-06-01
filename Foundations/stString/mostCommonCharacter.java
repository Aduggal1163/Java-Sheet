import java.util.*;
public class mostCommonCharacter {
    // mostCommonCharacter.java
    public static void main(String[] args) {
        String str="aaaabbcc";
        int [] frequency=new int[256];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            frequency[ch]++;
        }
        char mostCommonCharacter=str.charAt(0);
        int maxFrequency=0;
        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[i]>maxFrequency)
            {
                maxFrequency=frequency[i];
                mostCommonCharacter=(char)i;
            }
        }
        System.out.println(mostCommonCharacter);
    }
}
