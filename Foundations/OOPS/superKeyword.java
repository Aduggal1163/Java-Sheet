package OOPS;
// superKeyword.java
public class superKeyword {
    public static void main(String[] args) {
        Horse h=new Horse();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse");
    }
}
