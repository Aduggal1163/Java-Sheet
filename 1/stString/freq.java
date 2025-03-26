public class freq {
    //freq of each elt;
    public static void main(String[] args) {
        String str="AABBCCCCDDDEFF";
        String newStr="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr+=count.toString();
            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
}