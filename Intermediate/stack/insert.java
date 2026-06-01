import java.util.Stack;

class insert{
    public static void main(String[] args) {
        {
            ///insert at bottom
            // Stack<Integer>ori=new Stack<>();
            // ori.push(1);
            // ori.push(2);
        //     Stack<Integer>tem=new Stack<>();
        //     while(!ori.isEmpty())
        //     {
        //         tem.push(ori.pop());
        //     }
        //     ori.push(3);
        //     while(!tem.isEmpty())
        //     {
        //         ori.push(tem.pop());
        //     }
        //     System.out.println(ori);
            ///insert at any index
            Stack<Integer>ori=new Stack<>();
            ori.push(10);
            ori.push(20);
            ori.push(30);
            ori.push(40);
            Stack<Integer>tem=new Stack<>();
            int index=2;
            System.out.println(ori);
            while(ori.size()>=index)
            {
                tem.push(ori.pop());
            }
            ori.push(100);
            while(!tem.isEmpty())
            {
                ori.push(tem.pop());
            }
            System.out.println(ori);
    }
    }
}