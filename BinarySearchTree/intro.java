
import java.util.ArrayList;



public class intro{
    static class Node{
        int data ; 
        Node left ; 
        Node right ; 

        Node(int data){
            this.data = data ; 
            left = null ; 
            right = null ; 
        }

    }
    public static Node insert(Node root , int val ){
        if(root == null){
            root = new Node(val) ;    
            return root ; 
        }
        if(root.data > val){
            root.left = insert(root.left , val) ; 

        }else{
            root.right = insert(root.right , val ) ; 
        }
        return root ; 
    }
    public static void inorder(Node root){
        if(root == null){
            return ; 
        }
        inorder(root.left); 
        System.out.print(root.data + " ") ; 
        inorder(root.right) ; 

    }

    public static boolean search(Node root , int key ) {
        if(root == null){
            return false ; 
        }

        if(root.data == key){
            return true ; 
        }
        if(root.data > key){
            return search(root.left, key) ; 
        }else{
            return search(root.right, key) ; 
        }
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right, val); 
        }else if(root.data > val){
            root.left = delete(root.left , val); 
        }else{
            if(root.left == null && root.right == null){
                return null ; 
            }
            if(root.right == null){
                return root.left ; 
            }else if(root.left == null){
                return root.right; 
            }

            Node inOrderSuccessor = findInOrderSuccessor(root.right) ; 
            root.data = inOrderSuccessor.data ; 
            root.right = delete(root.right , inOrderSuccessor.data ) ; 
        
        }    
        return root ; 
    }
    public static Node findInOrderSuccessor(Node root ){
            while(root == null){
                root = root.left ; 
            }
            return root ; 
    }
    public static void printInRange(Node root , int k1 , int k2){
        if(root == null){
            return ; 
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2); 
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2); 
        }
        else if(root.data <= k1){
            printInRange(root.left, k1, k2); 
        }else{
            printInRange(root.right, k1, k2);
        }

    }
    public static void printPath(ArrayList <Integer> path){
        for(int i = 0 ; i < path.size() ; i ++){
            System.out.print(path.get(i) + "-> ") ; 
        }
        System.out.println() ; 
    }
    
    public static void printRootToLeaf(Node root , ArrayList<Integer> path){
         if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        path.remove(path.size() - 1);

    }

    public static boolean isValidBST(Node root , Node min , Node max){
        if(root == null){
            return true; 
        }
        if(min != null && root.data <= min.data){
            return false ; 
        }
        else if(max != null && root.data >= max.data){
            return false; 
        }
        return isValidBST(root.left, min, root) &&
        isValidBST(root.right, root, max);

    }

    public static Node mirror(Node root ){
        if(root == null){
            return null; 
        }
        Node leftNode = mirror(root.left) ; 
        Node rightNode = mirror(root.right); 

        root.left = rightNode ; 
        root.right = leftNode; 
        return root ; 

    }
public static Node createBST(int arr[] , int st , int end ){
    if(st > end){
        return  null ; 
    }
    int mid = (st + end) / 2 ; 
    Node root = new Node (arr[mid]) ; 

    root.left = createBST(arr, st, mid - 1 ) ; 
    root.right = createBST(arr, mid + 1 , end) ; 
    return root ; 
}
    public static void main(String[] args) {
        int values[] = {3 , 5 , 6, 8 , 10 , 11 , 12} ;  
        Node root = createBST(values, 0, values.length - 1 ) ; 
        inorder(root);
        
        
    }
}