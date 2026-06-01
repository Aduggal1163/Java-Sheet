import java.util.*;
public class input {
    public static void main(String args[])
    {
        // Scanner sc= new Scanner(System.in);
        // // String input=sc.next();
        // String input=sc.nextLine();
        // int number=sc.nextInt();
        // System.out.println(input);
        // System.out.println(number);
        // long a=10;
        // int b=a;
        // int a=10;
        // long b=a;
        // System.out.println(b);
        // int a=10;
        // int b=++a;
        // System.out.println(a);
        // int a=10;
        // int b=a++;
        // System.out.println(a);
        // int a=20;
        // int b=a++;
        // System.out.println(a);
        // int no=3;
        // String type=(no%2==0)?"EVEN":"ODD";
        // System.out.println(type);
        // boolean larger= (5>3) ? true:false;
        // System.out.println(larger);
        // int number=0;
        // while(number<100){
        //     System.out.println(number);
        //     number++;
        // }
        // System.out.println("PRINTED 100x");
        // for(int i=1;i<=10;i++){
        //     System.out.println(i);
        // }

        // int a=10;
        // int b=40;
        // double c=20.1234455;
        // System.out.printf("\"%d\"",a);
        // System.out.printf("%.2f",c);
        // System.out.println(b);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("User input data = "+ n);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("You have entered: "+ str);
        double d=sc.nextDouble();
        System.out.print("Float: "+d);
    }
}
