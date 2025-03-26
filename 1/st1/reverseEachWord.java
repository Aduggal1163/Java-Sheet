package st1;
import java.util.*;
// reverseEachWord.java
// input - Java Programming Language
// output - avaJ gnimmargorP egaugnaL
public class reverseEachWord {
    public static void reverse(char[] chars,int i,int j){
            while(i<j)
            {
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
    }
    public static String revWord(String str){
    char chars[]=str.toCharArray();
    int start=0;
    int n=chars.length;
    for(int end=0;end<=n;end++)
    {
        if(end==n||chars[end]==' ')
        {
            reverse(chars,start,end-1);
            start=end+1;
        }
       
    }
    return new String(chars);
    }
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(revWord(str));
   }  
}
