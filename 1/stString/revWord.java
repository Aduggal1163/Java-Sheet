public class revWord {
    public static void reverse(char chars[],int i,int j)
    {
        while(i<j)
            {
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
    }
    public static String reverseWord(String str)
    {
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
    public static void main(String[] args) {
        String str="Hello World";
        String rev=reverseWord(str);
        System.out.println(rev);
    }
}
