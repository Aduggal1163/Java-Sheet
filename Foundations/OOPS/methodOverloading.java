package OOPS;
public class methodOverloading {
    public static void main(String[] args) {
            int a=5;
            int b=5;
            Calculator cal=new Calculator();
            System.out.println(cal.sum(a,b));        
    }   
}
class Calculator{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a , float b)
    {
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
