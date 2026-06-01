public class clearWhitespaces {
    public static void main(String[] args) {
        String str = "   Hello   World   ";
        System.out.println("Original String: " + str);
    //    String res=str.replace(" ", "");
    //    System.out.println(res);
        char[] chars=str.toCharArray();
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            
            if(str.charAt(i)!=' ')
            {
                chars[index]=str.charAt(i);
                index++;
            }
            
        }
        System.out.println(new String(chars,0,index));
    }
}
