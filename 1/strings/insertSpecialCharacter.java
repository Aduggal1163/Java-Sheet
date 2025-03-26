package strings;

public class insertSpecialCharacter {
    public static void main(String[] args) {
        String str = "spacing";
        int charArray[] = {0, 1, 2, 3, 4, 5, 6};
        // char specialChar = '*'; 
        // StringBuilder modifiedStr = new StringBuilder(str);
        // for (int i = 0; i < charArray.length; i++) {
        //     modifiedStr.insert(charArray[i]+i, specialChar);
        // }

        // System.out.println(modifiedStr.toString());
    String result="";
    int j=0;
    for(int i=0;i<str.length();i++)
    {
        if(j<charArray.length&&i==charArray[j]){
            result+="*";
            j++;
        }
        result+=str.charAt(i);
    }
    System.out.println(result);
    }

}
