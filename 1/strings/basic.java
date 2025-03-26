package strings;
import java.util.*;
public class basic {
    public static void printletters(String s)
    {
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        char arr[]={'a','b','o'};
        String str="ABO";
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        printletters(str);
    }
}
