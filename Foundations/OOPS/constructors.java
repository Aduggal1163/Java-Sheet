package OOPS;

public class constructors {
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="ABHISHEK DUGGAL";
        s1.rollno=1163;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=89;
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
//     Student(Student s1){ //shallow copy constructor
//         marks=new int[3];
//       this.name=s1.name;
//       this.rollno=s1.rollno;
//       this.marks=s1.marks; ///pura array ni copy hua uska ref hua copy
//   }
//deep copy constructor;
    Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.rollno=s1.rollno;
            for(int i=0;i<marks.length;i++){
                this.marks[i]=s1.marks[i];
            }
    }

    Student(){
        marks=new int[3];
        System.out.println("NON PARAMETERIZED CONSTRUCTOR IS INVOKED NOW");
    }
   
    Student(int rollno){
        marks=new int[3];
        this.rollno=rollno;
        System.out.println("PARAMETERIZED CONSTRUCTOR INVOKED");
    }
}