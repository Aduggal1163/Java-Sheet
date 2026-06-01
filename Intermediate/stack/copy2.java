import java.util.Stack;

public class copy2 {
    //copy without using extra space
    public static void displayRev(Stack<Integer>ori)
    {
        if(ori.isEmpty())
        return;
        int temp = ori.pop();
        displayRev(ori);
        System.out.println(temp);
        ori.push(temp);
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
