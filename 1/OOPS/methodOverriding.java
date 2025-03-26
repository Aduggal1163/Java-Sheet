package OOPS;
//methodOverriding.java
public class methodOverriding {
    public static void main(String args[])
    {
        Deer O=new Deer();
        O.eat();
    }
}
class Animal{
    void eat(){
        System.out.print("eats anything");
    }
}
class Deer extends Animal{
    void eat()
    {
        System.out.print("eats only the grass");
    }
}
