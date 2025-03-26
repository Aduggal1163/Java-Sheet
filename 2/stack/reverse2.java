import java.util.Stack;
public class reverse2 {
    //reverse without extra space
    public static void displayRev(Stack<Integer>ori)
    {
        if(ori.isEmpty())
        return;
        int top=ori.pop();
        System.out.println(top);
        displayRev(ori);
        ori.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>ori=new Stack<>();
        ori.push(10);
        ori.push(20);
        ori.push(30);
        ori.push(40);
        displayRev(ori);
    }

}
