public class insertSpecialCharacter {
    // insertSpecialCharacter.java
    public static void main(String[] args) {
        String str = "ABCDEFGI";
        int charArray[] = {1,3,6};
        int j=0;
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(j<charArray.length&&i==charArray[j])
            {
                ans+="*";
                j++;
            }
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
