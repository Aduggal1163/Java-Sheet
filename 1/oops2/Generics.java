package oops2;
public class Generics {
    public static void main(String[] args) {
        Dog<Integer,String>d1=new Dog<>(1,"asv");
        // Dog<Integer>d=new Dog<>(10);
        System.out.println(d1.id);
    }
}
class Dog<E,V>{
    E id;
    V name;
    Dog(E id,V name)
    {
        this.id=id;
        this.name=name;
    }
}
