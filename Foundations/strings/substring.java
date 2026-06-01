package strings;

public class substring {
    public static String substr(String s,int si,int ei)
    {
        String ans="";
        for(int i=si;i<ei;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(substr(str,0,5));
        System.out.println(str.substring(0,5));
    }
}
