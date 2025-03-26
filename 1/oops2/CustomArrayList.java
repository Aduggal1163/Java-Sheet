package oops2;

import java.util.*;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
     public void add(int num){
        if(isFull())
        {
            resize();
        }
        data[size++]=num;
     }
    private boolean isFull()
    {
        return size==data.length;
    }
    private void resize()
    {
        int [] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    private int remove()
    {
        int removed=data[--size];
        return removed;
    }
    public int get(int index)
    {
        return data[index];
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomArrayList list=new CustomArrayList();
        list.add(3);
        list.add(5);
        System.out.println(list);
    }
}
