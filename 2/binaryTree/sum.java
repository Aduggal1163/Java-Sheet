package binaryTree;

public class sum {
    public static int sumofallnodes(Node root)
    {
        int sum=0;
        if(root==null)return 0;
        return root.val+(sumofallnodes(root.left))+sumofallnodes(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.println(sumofallnodes(a));
    }
}
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}