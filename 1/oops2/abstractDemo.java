package oops2;

public class abstractDemo {
    public static void main(String[] args) {
            Son s= new Son(10);
            s.career("Developer");
            Parent.greetings();
    }
}

abstract class Parent {
    int age;
    Parent(){
        System.out.println("Parent");
    }
    static void greetings(){
        System.out.println("Hello");
    }
    abstract void career(String name);
    abstract void patner(String name);
}

class Son extends Parent {
    Son(int age){
        this.age=age;
        System.out.println("Son");
    }
    void career(String name) {
        System.out.println("i am " + name);
    }

    void patner(String name) {
        System.out.println("I love " + name);
    }
}
class Daughter extends Parent {
    Daughter(int age){
        this.age=age;
        System.out.println("Daughter");
    }
    void career(String name) {
        System.out.println(name);
    }

    void patner(String name) {
        System.out.println(name);
    }
}