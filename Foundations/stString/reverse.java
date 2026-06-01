public class reverse {
    public static String rev(String str)
    {
        int i=0;
        int j=str.length()-1;
        char chars[]=str.toCharArray();
        while(i<j)
        {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str="abcd";
        String s=rev(str);
        System.out.println(s);
    }
}
