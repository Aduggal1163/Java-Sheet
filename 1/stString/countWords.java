public class countWords {
    public static int count(String input)
    {
        int n=input.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if((i==0||input.charAt(i-1)==' ')&& input.charAt(i)!=' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "    Welcome      to  Java   Class   ";
        int wordCount=count(input);
        System.out.println(wordCount);

    }
}
