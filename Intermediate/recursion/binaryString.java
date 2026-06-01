public class binaryString {
    //Generte all binary strings of length n without consecutive 1's 
    public static void binary(String s, int n)
    {
        int m=s.length();
        if(m==n)
        {
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0') {
            binary(s+'0',n);
            binary(s+'1', n);
        }
        else
        binary(s+'0', n);
    }
    public static void main(String[] args) {
        int n=3;
        binary("",n);
    }
}
