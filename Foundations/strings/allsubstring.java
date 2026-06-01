package strings;
import java.util.*;
public class allsubstring {
    public static void alls(String str)
    {
        for(int i=1;i<=str.length();i++){
            for(int j=0;j<=str.length()-i;j++){
                    int x=j+i-1;
                for(int k=j;k<=x;k++){
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
        }   
    }
    public static void main(String[] args) {
        String str="abcd";
        alls(str);
    }
}
