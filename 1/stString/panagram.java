public class panagram {
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog";
        s=s.toLowerCase();
        boolean [] letters=new boolean [26];
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(!letters[ch-'a'])
                {
                    letters[ch-'a']=true;
                    count++;
                }
            }
        }
        if(count==26)
        {
            System.out.println("panagram");
        }
        else
        {
            System.out.println("No panagram");
        }
    }
}
