package oops2;
public class interfaces2 {
    public static void main(String[] args) {
        Monkey m1=new Monkey();
        m1.drinks();
        System.out.println(Monkey.legs);
        Animal.isAlive();
    }
}
interface Animal{
    int legs=4;
    void eats();
    void drinks();
    static void isAlive(){
        System.out.println("Animal is Alive.");
    }
}
interface pet{
    void sings();
    void drinks();
}
class Monkey implements Animal,pet{
    public void eats(){
        System.out.println("monkey is eating banana");
    }
    public void sings(){
        System.out.println("monkey is singing");
    }
    public void drinks(){
        System.out.println("monkey is drinking");
    }
}
