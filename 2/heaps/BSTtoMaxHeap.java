class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class BSTtoMaxHeap {
    public static boolean ismaxHeap(Node root)
    {
        int n=size(root);
        return isHeap(root) && isCBT(root,0,n);
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static boolean isCBT(Node root, int i, int n){
        if(root==null)return true;
        if(i>=n)return false;
        return isCBT(root.left,2*i+1, n) && isCBT(root.right, 2*i+2, n);
    }
    public static boolean isHeap(Node root) {
        if (root == null)
            return true;
        if (root.left != null) {
            if (root.val < root.left.val)
                return false;
        }
        if (root.right != null) {
            if (root.val < root.right.val)
                return false;
        }
        return isHeap(root.left) && isHeap(root.right);
    }
    public static void main(String[] args) {
        // is bst a maxheap or not
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(ismaxHeap(a));
    }
}
