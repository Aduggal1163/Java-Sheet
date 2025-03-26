package oops2;

public class staticInitialization {
    static int a=4;
    static int b;
    static{
        System.out.println("I'm inside static block");
        b=a*5;
    }
    public static void main(String[] args) {
        staticInitialization obj=new staticInitialization();
        System.out.println(staticInitialization.a);
        System.out.println(staticInitialization.b);

    }
}
