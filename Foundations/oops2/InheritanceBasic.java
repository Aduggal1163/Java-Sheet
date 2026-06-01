package oops2;

public class InheritanceBasic {
        public static void main(String[] args) {
                Box b=new Box();
                b.information();
                System.out.println(b.l);

                Box a=new Box(4);
                System.out.println(a.l);

                Box box1=new Box(1,2,3);
                Box box2=new Box(box1);
                System.out.println(box2.l);

                boxChild box3=new boxChild();
                System.out.println(box3.l+" "+box3.boxWeight);

                boxChild box4=new boxChild(5,6,6,10);
                System.out.println(box4.l+" "+box4.boxWeight);

                Box box5=new boxChild(1, 2, 3, 6);
                System.out.println(box5.w);
                // System.out.println(box5.boxWeight); not able to access

        }
}

class Box {
        int l;
        int w;
        int h;

        Box() {
                this.l = -1;
                this.w = -1;
                this.h = -1;
        }
        Box(int side)
        {
                this.l=side;
                this.w=side;
                this.h=side;
        }
        Box(int l,int h,int w)
        {
                this.l=l;
                this.h=h;
                this.w=w;
        }
        Box(Box old)
        {
                this.l=old.l;
                this.w=old.w;
                this.h=old.h;
        }
        public void information(){
                System.out.println("you have entered in box category!");
        }
}
class boxChild extends Box{
        int boxWeight;
        boxChild(){
                System.out.println("you have entered in box child category!");
                this.boxWeight=10;
        }
        boxChild(int l,int b,int h,int boxWeight)
        {
                super(l,b,h); // it calls the parent class constructor which exists
                System.out.println(super.h);
                this.boxWeight=boxWeight;
        }
}
