
import java.util.*;

public class height{
    static class Node{
        int data ; 
        Node left , right ; 

        public Node(int data){
            this.data = data ; 
            this.left = null ; 
            this.right = null ; 
            
        }
    }
    public static int height(Node root){
        if(root == null ){
            return 0 ; 
        }
        int lh = height(root.left); 
        int rh = height(root.right);
        return Math.max(lh , rh) + 1 ;  
    }

    public static int count(Node root){
        if(root == null){
            return 0 ; 
        }
        int lc = count(root.left); 
        int rc = count (root.right); 
        int treeCount = lc + rc + 1 ; 
        return treeCount ; 
    }

    public static int sum(Node root){
        if(root == null){
            return 0 ; 
        }
        int leftSum = sum(root.left); 
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data ; 

    }

    public static int daimeter2(Node root){
        if(root == null){
            return 0 ; 
        }
        int leftDaim = daimeter2(root.left); 
        int rightDaim = daimeter2(root.right) ; 
        int leftHeight = height(root.left) ; 
        int rightHeight = height(root.right) ; 

        int selfDaim = leftHeight + rightHeight + 1 ; 
        
        return Math.max(selfDaim , Math.max(leftDaim , rightDaim)) ; 
    }
    static class Info{
        int daim ; 
        int height ; 

        public Info(int daim , int height) {
            this.daim = daim ; 
            this.height = height ;  

        }        
    }

    public static Info daimeter(Node root){
        if(root == null){
            return new Info(0 , 0 ) ; 
        }
        Info leftInfo = daimeter(root.left) ; 
        Info rightInfo = daimeter(root.right) ; 

        int selfDaim = Math.max(Math.max(leftInfo.daim , rightInfo.daim ), rightInfo.height + leftInfo.height + 1 ) ; 
        int height = Math.max(leftInfo.height , rightInfo.height) + 1 ;   

        return new Info(selfDaim , height) ; 

    }

    public static boolean  identical(Node node , Node subRoot){
        if(node == null && subRoot == null){
            return true ; 
        }else if(node == null || subRoot == null || node.data != subRoot.data ){
            return false ; 
        }
        if(!identical(node.left, subRoot.left)){
            return false ; 
        }
        if(!identical(node.right, subRoot.right)){
            return false ; 
        }
        return true ; 
        
    }
    public static boolean isSubtree(Node root , Node subRoot){
        if(root == null ){
            return false ; 
        }
        if(root.data == subRoot.data ){
            if(identical(root , subRoot)){
                return true ; 
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) ; 
    }
    static class Information{
        Node node ; 
        int hd ; 

        public Information(Node node , int hd ){
            this.node  = node ; 
            this.hd = hd ; 
        }
    }
    public static void topView(Node root){
        Queue<Information> q = new LinkedList<>(); 
        HashMap<Integer , Node > map = new HashMap<>();  
        int max = 0 , min = 0 ; 
        q.add(new Information(root , 0)); 
        q.add(null) ; 
        
        while(!q.isEmpty()){
            Information curr = q.remove(); 
            if(curr == null ){
                if(q.isEmpty()){
                    break ; 
                } else{
                    q.add(null) ; 
                }
            }else{

                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd , curr.node) ; 
                }
                if(curr.node.left != null){
                    q.add(new Information(curr.node.left , curr.hd-1)) ; 
                    min = Math.min(min , curr.hd -1 ) ; 
                }
                if(curr.node.right != null){
                    q.add(new Information(curr.node.right , curr.hd + 1)); 
                    max = Math.max(max , curr.hd + 1 ) ; 
                }

                }
            }
                for(int i = min ; i < max + 1 ; i++){
                    System.out.println(map.get(i).data); 
                }
    }

    public static void kLevel(Node root , int level , int k ){
        if(level == k){
            System.out.print(root.data + " "); 
            return ; 
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    public static Node lca(Node root , int n1 , int n2){
        if(root == null){
            return null ; 
        }
        if(root.data == n1  || root.data == n2){
            return root ; 
        }

        Node left = lca(root.left , n1 , n2 ); 
        Node right = lca(root.right , n1 , n2 ); 

        if(left != null && right != null){
            return root ; 
        }
        if(left != null){
            return left ; 
        }
        return right ; 
    }

    public static int distance(Node root , int n) {
        if (root == null ){
            return -1 ; 
        }
        if (root.data == n) {
            return   0 ; 
        }

        int leftDist = distance(root.left, n) ; 
        int rightDist = distance(root.right , n ) ; 

        if(leftDist == -1 && rightDist == -1){
            return -1 ; 
        }else if(leftDist == -1){
            return rightDist + 1; 
        }else{
            return leftDist + 1;   
        }

    }
    public static int minDist(Node root , int n1 , int n2){
        Node lca = lca(root, n1, n2) ; 
        int dist1 = distance(lca , n1) ; 
        int dist2 = distance(lca , n2) ; 

        return dist1 + dist2 ; 
    }

    public static int kAncestor(Node root , int n , int k ){
        if(root == null){
            return -1 ; 
        }
        if(root.data == n){
            return 0 ; 
        }
        int leftDist = kAncestor(root.left, n, k); 
        int rightDist = kAncestor(root.right, n, k) ; 

        if(rightDist == -1 && leftDist == -1){
            return -1 ; 
        }
        
        int max = Math.max(leftDist , rightDist) ; 
        if(max + 1 == k ){
            System.out.println(root.data) ; 
        }
        return max+ 1 ; 
    }
    
    public static int treeSum(Node root){
        if(root == null){
            return 0 ; 
        }
        int leftSum = treeSum(root.left);
        int rightSum = treeSum(root.right) ; 
        
        int data = root.data ; 
        int sum = leftSum + rightSum + root.left.data + root.right.data  ; 
        root.data = sum ; 
        return  data;   
        
    }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3) ; 
        root.left.left = new Node(4) ; 
        root.left.right = new Node(5) ; 
        root.right.left = new Node(6) ; 
        root.right.right = new Node(7) ; 

        kAncestor(root, 5, 2); 
    }
}