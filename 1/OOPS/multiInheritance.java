package OOPS;

public class multiInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
            dobby.breed="Pitbull";
            System.out.println(dobby.breed);
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
}
//derived class

class Mammal extends Animals{
    int legs;
    Mammal(){
        System.out.println("CONSTRUCTOR FOR MAMMAL IS INVOKED");
    }
}
class Dog extends Mammal{
    String breed;
    Dog(){
        System.out.println("CONSTRUCTOR FOR Dog IS INVOKED");
    }
} 

