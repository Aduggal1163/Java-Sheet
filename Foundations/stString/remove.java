public class remove {
    //remove particular char
    public static void main(String args[])
    {
        String str="Java Programming";
        int input='g';
        char chars[]=str.toCharArray();
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=input)
            {
                chars[index]=str.charAt(i);
                index++;
            }
        }
        String newStr = new String(chars, 0, index);
        System.out.println(newStr);  
      }
}
