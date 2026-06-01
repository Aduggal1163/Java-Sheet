package oops2;

public class basic {
    public static void main(String[] args) {
        Student s1=new Student();
        // s1.name="Abhishek Duggal";
        // s1.rollno=163;
        // s1.marks=99.9f ; // 99 will consider as 99.0
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks);
        s1.changeName("AD");
        s1.greeting();

        Student random=new Student(
            "Abhishek Duggal",
            127,
            88.8f
        );

        Student random2=new Student(s1);
        System.out.println(random.rollno);
        System.out.println(random2.marks);
    }
}
class Student{
    String name;
    int rollno;
    float marks;

    void greeting(){
        System.out.println("HI, my name is "+ this.name);
    }

    void changeName(String name){
        this.name=name;
    }

    Student(){
        this.name="Abhishek Duggal";
        this.rollno=163;
        this.marks=99.9f;
    }

    Student(String name,int rollno,float marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    Student (Student other2)
    {
        this.name=other2.name;
        this.rollno=other2.rollno;
        this.marks=other2.marks;
    }
}
