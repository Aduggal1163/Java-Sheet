package oops2;

public class hierarchialInheritance {
    public static void main(String[] args) {
        C obj=new C(10,10);
        System.out.println(obj.className);
    }
}
class A{
    int number;
    A(int number){
        System.out.println("Constructor of A is invoked");
        this.number=number;
    }
}
class B extends A{
    int rollno;
    B(int number,int rollno){
        super(number);

        System.out.println("Constructor of B is invoked");
        this.rollno=rollno;
    }
}
class C extends A{
    int className;
    C(int number,int className){
        super(number);
        System.out.println("Constructor of C is invoked");
        this.className=className;
    }
}
