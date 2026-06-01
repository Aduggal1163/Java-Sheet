package OOPS;
// multipleInheritance.java
public class multipleInheritance {
        public static void main(String []args)
        {
            Bear boo=new Bear();
            boo.eatAnimals();
            boo.eatGrass();
        }
}
interface Herbivorous{
    void eatGrass();
}
interface Carnivorous{
    void eatAnimals();
}
class Bear implements Herbivorous,Carnivorous{
    public void eatGrass() {
        System.out.println("Bear is eating grass");
    }
    public void eatAnimals(){
        System.out.println("bear is eating animals");
    }
}
