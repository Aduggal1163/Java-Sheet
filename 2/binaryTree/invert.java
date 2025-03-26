package binaryTree;

public class invert {
    public static void invert(Node root)
    {
            if(root==null)return;
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
            invert(root.left);
            invert(root.right);
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
        invert(a);
        
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