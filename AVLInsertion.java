import java.util.*;

class Node {
    int val;
    int height;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.height = 1;
        left=right=null;
    }
}

class Main {
    public static int getHeight(Node root) {
        if(root == null) return 0;
        return root.height;
    }
    public static int getBalance(Node root) {
        return getHeight(root.left) - getHeight(root.right);
    }
    
    public static Node rotateRight(Node root) {
        Node child = root.left;
        Node childRight = child.right;
        child.right = root;
        root.left = childRight;
        root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left),getHeight(child.right));
        return child;
    }
    
    public static Node rotateLeft(Node root) {
        Node child = root.right;
        Node childLeft = child.left;
        child.left = root;
        root.right = childLeft;
        root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
        child.height = 1 + Math.max(getHeight(child.left),getHeight(child.right));
        return child;
    }
    
    public static Node insert (Node root, int key) {
        if(root == null) return new Node(key);
        else if(root.val < key) root.right = insert(root.right,key);
        else if(root.val > key) root.left = insert(root.left,key);
        else return root;
        //update height
        root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
        //balancing check
        int balance = getBalance(root);
        
        //LL case
        if(balance > 1 && key < root.left.val) {
            return rotateRight(root);
        }
        
        // LR case
        else if(balance > 1 && key > root.left.val) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        
        // RR case
        else if(balance < -1 && key > root.right.val) {
            return rotateLeft(root);
        }
        
        //RL case
        else if(balance < -1 && key < root.right.val) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        //balanced 
        else {
            return root;
        }
    }
    
    public static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        // no duplicate elements
        Node root = null;
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,50);
        root = insert(root,70);
        root = insert(root,5);
        root = insert(root,100);
        root = insert(root,95);
        inorder(root);
    }
}