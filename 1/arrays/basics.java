package arrays;
import java.util.*;
public class basics {
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        // int marks[]=new int[99];
        // System.out.println(marks.length);
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // System.out.println("marks1: "+marks[0]);
        int marks[]={88,89,90};
        update(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}
