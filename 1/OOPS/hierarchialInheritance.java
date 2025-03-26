package OOPS;

public class hierarchialInheritance {
    
    public static void main(String[] args) {
        // Fish Dolphin=new Fish();
        Dog d=new Dog();
        d.eat();
    }
}
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
}
class Fish extends Animals{
    Fish(){
        System.out.println("CONSTRUCTOR OF FISH IS INVOKED TOO");
    }
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
class Dog extends Animals{
    int legs;
    Dog(){
        System.out.println("CONSTRUCTOR");
    }
}