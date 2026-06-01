package OOPS;

public class Abstract {
    public static void main(String[] args) {
            Horse h=new Horse();
            h.eat();
            h.walk();
            Chicken c=new Chicken();
            c.eat();
            c.walk();
            // Animal a=new Animal() yeh ni kr skte hum  
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){ //non abstract method
        System.out.println("animal eats");
    }
    abstract void walk(); //animal ne ik idea dedia vi walk naam ka func exsits krna chaahiya hr child class mei animal ki
}
class Horse extends Animal{ //ab yeh compulsury hogya v animal ke pass walk method tha ab yeh horse ke pass vi hona padega
     void changeColor(){
     color="Dark Brown";
    }
     void walk(){
        System.out.println("horse walks");
     }
}
class Chicken extends Animal{
    void changeColor(){
     color="White";
    }
    void walk(){
        System.out.println("chicken walks");
    }
}