package binaryTree;

import java.util.Scanner;

public class eltatNlevel {
    static int n;

    public static void nthlevel(Node root,int level)
    {
        if(root==null)return;
        if(level==n)System.out.print(root.val+" ");
        nthlevel(root.left, level+1);
        nthlevel(root.right, level+1);
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
        n=1;
        nthlevel(a,0);
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
