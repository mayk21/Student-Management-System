
public class AVLTree {
    Node root; 
    private int height(Node N) { 
        if (N == null) 
            return 0; 
  
        return N.height; 
    } 
  
    private int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 

    private Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 

        x.right = y; 
        y.left = T2; 

        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 

        return x; 
    } 

    private Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 

        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 

        return y; 
    } 

    private int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
    } 
  
    Node insert(Node node, Student s, int ID) { 
  
        if (node == null) 
            return (new Node(s)); 
  
        if (ID < node.ID) 
            node.left = insert(node.left, s, ID); 
        else if (ID > node.ID) 
            node.right = insert(node.right, s, ID); 
        else
            return node; 
  

        node.height = 1 + max(height(node.left), 
                              height(node.right)); 

        int balance = getBalance(node); 

        if (balance > 1 && ID < node.left.ID) 
            return rightRotate(node); 
  
        if (balance < -1 && ID > node.right.ID) 
            return leftRotate(node); 

        if (balance > 1 && ID > node.left.ID) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
        if (balance < -1 && ID < node.right.ID) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
        return node; 
    } 

    Node deleteNode(Node root, int ID) 
    { 
            if (root == null) 
                    return root; 

            if (ID < root.ID) 
                    root.left = deleteNode(root.left, ID); 

            else if (ID > root.ID) 
                    root.right = deleteNode(root.right, ID); 
            else
            { 

 
                    if ((root.left == null) || (root.right == null)) 
                    { 
                            Node temp = null; 
                            if (temp == root.left) 
                                    temp = root.right; 
                            else
                                    temp = root.left; 

                            if (temp == null) 
                            { 
                                    temp = root; 
                                    root = null; 
                            } 
                            else // One child case 
                                    root = temp;
                    } 
                    else
                    { 
                            Node temp = smallestNode(root.right); 
                            root = temp; 
                            root.right = deleteNode(root.right, temp.ID); 
                    } 
            } 
            if (root == null) 
                    return root; 

            root.height = max(height(root.left), height(root.right)) + 1; 
            int balance = getBalance(root); 
            if (balance > 1 && getBalance(root.left) >= 0) 
                    return rightRotate(root); 

            if (balance > 1 && getBalance(root.left) < 0) 
            { 
                    root.left = leftRotate(root.left); 
                    return rightRotate(root); 
            } 
            if (balance < -1 && getBalance(root.right) <= 0) 
                    return leftRotate(root); 

            if (balance < -1 && getBalance(root.right) > 0) 
            { 
                    root.right = rightRotate(root.right); 
                    return leftRotate(root); 
            } 

            return root; 
    }
    
    Node search(int ID){
        if(root == null)
            return null;
        
        Node iterator = root;
        while(iterator != null){
            if(ID < iterator.ID)
                iterator = iterator.left;
            else if(ID > iterator.ID)
                iterator = iterator.right;
            else{
                return iterator;
            }
        }
        
        return null;
    }
    
    void saveData(Node node) { 
        if (node != null) { 
            saveData(node.left); 
            FileOptions.saveData(node, "record.txt");
            saveData(node.right); 
        } 
    }
    
    private Node smallestNode (Node root){
        if (root.left != null)
            smallestNode(root.left) ;
        return root ;
    }
    
}
