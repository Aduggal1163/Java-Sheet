package OOPS;

public class basic {
    public static void main(String args[])
    {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.color="Yellow";
        System.out.println(p1.color);
        BankAccount ba=new BankAccount();
        ba.username="abhishek";
        ba.setPassword("123");
        p1.setTip(1);
        p1.getTip();
    }
}
class BankAccount{
    private String password;
    public String username;
    public void setPassword(String pwd){
        password=pwd;
    }
}
class Pen{
    String color;
    private int  tip;
    void setColor(String newColor){
        color=newColor;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    int getTip(){
        return this.tip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calPercentage(int math,int phy,int chem){
        percentage=(math+chem+phy)/3;
    }
}
