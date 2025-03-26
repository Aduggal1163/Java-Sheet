class subset{
    public static void printSubsets(int i, String str, String s)
    {
        if(i==str.length())
        {
            System.out.println(s);
            return;
        }
        printSubsets(i+1,str,s);
        printSubsets(i+1,str,s+str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abc";
        printSubsets(0, str, "");
    }
}