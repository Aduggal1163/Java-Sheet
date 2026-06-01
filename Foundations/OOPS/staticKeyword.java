package OOPS;
// staticKeyword.java
public class staticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="DAV";
        Student s2=new Student();
        System.out.println(s2.schoolName);
    }
}
class Student{
    String name;
    int rollno;

    static String schoolName;

    void setName(String name)
    {
        this.name=name;
    }
    String getName(){
        return name;
    }
}
