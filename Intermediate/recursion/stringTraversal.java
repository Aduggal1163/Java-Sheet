class stringTraversal{
    public static void solve(int i, String str)
    {
        if(i>str.length()-1) return;
        System.out.print(str.charAt(i)+" ");
        solve(i+1,str);
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        solve(0,str);
    }
}