package strings;
public class stringcompression {
    public static String compress(String s)
    {
        String newStr="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            Integer count=1;
            while(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=s.charAt(i);
            newStr+=count.toString();
        }
        return newStr;
    }
     public static void main(String[] args) {
        String str="aaabbccccco";
        System.out.println(compress(str));
     }
}
