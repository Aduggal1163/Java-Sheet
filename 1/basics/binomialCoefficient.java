public class binomialCoefficient {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n,int r)
    {
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        int sol=(n_fact)/(r_fact*nr_fact);
        return sol;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(binCoeff(n, r));
    }
}
