import java.util.*;
public class tax {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<5) System.out.println(" 0%Tax");
        else if (income>=5&& income<10) System.out.println("20% Tax");
        else System.out.println("30% Tax");

    }
}
