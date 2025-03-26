package oops2;
public class Interfaces {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }    
}
interface Engine{
    static final int price=90000;
    void acc();
    void start();
    void stop();
}
interface Brake{
    void brake();
}
interface Media{
    void start();
    void stop();
}
class Car implements Engine,Brake,Media{
    Car(){
        System.out.println("Car is created");
    }
    public void acc(){
        System.out.println("Car is accelerating");
    }
    public void start(){
        System.out.println("Car is started");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
    public void brake(){
        System.out.println("Car is braking");
    }
}
