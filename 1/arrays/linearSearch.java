package arrays;
import java.util.*;
public class linearSearch {
    public static int ls(int marks[],int key){
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        
        int marks[]=new int[n];
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
        System.out.print("ENTER KEY: ");
        int key=sc.nextInt();
        int index=ls(marks,key);
        if(index==-1) System.out.println("KEY NOT FOUND");
        else
        System.out.println("KEY FOUND AT INDEX: "+index);
    }
   
}
