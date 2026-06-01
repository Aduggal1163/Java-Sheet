class sum1ToN{
   public static int sum(int n)
   {
    if(n==0) return 0;
    return n%10+sum(n/10);
   }
    public static void main(String[] args) {
        int n=45;
        int sum=sum(n);
        System.out.print(sum);
    }
}