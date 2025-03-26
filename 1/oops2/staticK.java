package oops2;

public class staticK {
    public static void main(String[] args) { //static because as it is common to everyone static variable are not dependent on objects we can use them without objects too!
        //inside static method (like main) you cannot use anything that is not static 
        //static is independent on objects and non-static is dependent on objects.You cannot use this keyword in static methods because this represents the object
            Human Abhi= new Human("Abhishek Duggal",1163,90000);
            Human Aastha= new Human("Aastha",1127,90000);
            System.out.println(Abhi.population);
    }
}
class Human{
    String name;
    int rollNo;
    int salary;
    static long population;
    Human(String name,int rollNo,int salary)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.salary=salary;
        Human.population+=1;
    }
}

