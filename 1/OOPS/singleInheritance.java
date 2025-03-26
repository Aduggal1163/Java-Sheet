package OOPS;

public class singleInheritance {
    public static void main(String[] args) {
        Fish Dolphin=new Fish();
        Dolphin.eat();
    }
}
//base class
class Animals{
    String color;
    Animals(){
        System.out.println("CONSTRUCTOR OF ANIMAL IS INVOKED");
    }
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}//derived class
class Fish extends Animals{
    Fish(){
        System.out.println("CONSTRUCTOR OF FISH IS INVOKED TOO");
    }
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}