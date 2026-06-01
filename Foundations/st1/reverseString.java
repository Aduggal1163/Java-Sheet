package st1;

public class reverseString {
    public static void main(String args[])
    {
        String s="abc";
        int i=0;
        int j=s.length()-1;
        char str[]=s.toCharArray();
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        System.out.println(str);
    }
}
