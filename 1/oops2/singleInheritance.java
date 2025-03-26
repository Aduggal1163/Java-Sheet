package oops2;

public class singleInheritance {
    public static void main(String[] args) {
        
        boxPrice p1=new boxPrice(11, 9);
        System.out.println(p1.price);
    }
}
class Box{
    int unit;
    Box(int unit)
    {
        this.unit=unit;
    }
}
class boxPrice extends Box
{
    int price;
    boxPrice(int unit,int price)
    {
        super(unit);
        this.price=price*unit;
    }
}
