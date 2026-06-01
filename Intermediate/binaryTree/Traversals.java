package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    public static void preorder(Node root)
    {
        if(root==null)return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }  
    public static void inorder(Node root)
    {
        if(root==null)return;
        preorder(root.left);
        System.out.println(root.val);
        preorder(root.right);
    }  public static void postorder(Node root)
    {
        if(root==null)return;
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.val);
    }
    public static void levelOrder(Node root)
    {
       Queue<Node> q=new LinkedList<>();
       if(root!=null)q.add(root);
       while(!q.isEmpty())
       {
        Node front=q.remove();
        System.out.print(front.val+" ");
        if(front.left!=null)q.add(front.left);
        if(front.right!=null)q.add(front.right);        
       }
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
        levelOrder(a);
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
////////////////////////////////////////////////
//leetcode 
//226 100 101 543 102 236 199 105 110 113 437 
//bst: 700 938 701 230 98 1038
