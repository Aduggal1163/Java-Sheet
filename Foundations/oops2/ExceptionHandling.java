package oops2;
import java.util.*;
public class ExceptionHandling {
    public static int divide(int a,int b) throws ArithmeticException
    {
        //if(b==0) throw new ArithmeticException("dont div by 0");
        return a/b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            // int c=a/b;
            // divide(a, b);
            String name="Abhishekkk";
            if(name.equals("Abhishekkk")) throw new MyException("MERA MARJII HA");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("No matter what this will always run");
        }
    }
}
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}