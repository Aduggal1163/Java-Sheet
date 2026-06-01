public class Node
{
    int data, height;
    Node left, right;
    Node(int x)
    {
        data = x;
        height = 1;
        left = right = null;
    }
}

class Sol {
    
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
    
    public static Node deleteNode(Node root, int key) {
        // code here.
        if (root == null) return null;
        if (root.data > key) root.left = deleteNode(root.left,key);
        else if (root.data < key) root.right = deleteNode(root.right,key);
        else {
            // leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // one child
            else if (root.left != null && root.right == null) {
                Node temp = root.left;
                return temp;
            }
            else if(root.left == null && root.right != null) {
                Node temp = root.right;
                return temp;
            }
            //two child
            else {
                //right side smallest
                Node curr = root.right;
                while(curr.left != null) {
                    curr=curr.left;
                }
                root.data = curr.data;
                root.right = deleteNode(root.right,root.data);
                
            }
        }
        //update the height
        root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
        
        //check the balancing
        int balance = getBalance(root);r
        
        //Left side 
        if (balance > 1) {
            //LL
            if(getBalance(root.left)>=0) return rotateRight(root);
            //LR
            else {
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            }
        }
        //Right side
        else if(balance < -1) {
            //RR
            if(getBalance(root.right) <= 0) return rotateLeft(root);
            //RL
            else {
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }
        }
        else return root;
    }
}