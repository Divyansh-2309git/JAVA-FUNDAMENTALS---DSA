/**
 * Program Name : height
 * Topic        : Binary Tree
 * Difficulty   : Advanced
 * Concepts     : Height, Diameter (O(N)), Top View, Lowest Common Ancestor (LCA), K-th Ancestor
 * -------------------------------------------------------------
 * Description  :
 * Comprehensive binary tree properties utility computing tree height, node count, diameter,
 * subtree detection, top view, LCA, minimum distance between nodes, and K-th ancestor.
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class height {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int calculateHeight(Node root) {
        if (root == null) return 0;
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int countNodes(Node root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static int calculateSum(Node root) {
        if (root == null) return 0;
        return calculateSum(root.left) + calculateSum(root.right) + root.data;
    }

    static class TreeInfo {
        int diameter;
        int height;

        public TreeInfo(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    /**
     * Optimized O(N) Diameter calculation returning both height and diameter in a single pass.
     */
    public static TreeInfo calculateDiameterOptimized(Node root) {
        if (root == null) return new TreeInfo(0, 0);

        TreeInfo leftInfo = calculateDiameterOptimized(root.left);
        TreeInfo rightInfo = calculateDiameterOptimized(root.right);

        int selfDiameter = leftInfo.height + rightInfo.height + 1;
        int maxDiameter = Math.max(selfDiameter, Math.max(leftInfo.diameter, rightInfo.diameter));
        int treeHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new TreeInfo(maxDiameter, treeHeight);
    }

    /**
     * Finds Lowest Common Ancestor (LCA) of nodes n1 and n2.
     */
    public static Node getLCA(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = getLCA(root.left, n1, n2);
        Node rightLCA = getLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static int findDistance(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int leftDist = findDistance(root.left, n);
        int rightDist = findDistance(root.right, n);

        if (leftDist == -1 && rightDist == -1) return -1;
        return (leftDist != -1) ? leftDist + 1 : rightDist + 1;
    }

    public static int minDistanceBetweenNodes(Node root, int n1, int n2) {
        Node lcaNode = getLCA(root, n1, n2);
        int dist1 = findDistance(lcaNode, n1);
        int dist2 = findDistance(lcaNode, n2);
        return dist1 + dist2;
    }

    public static int getKthAncestor(Node root, int targetNode, int k) {
        if (root == null) return -1;
        if (root.data == targetNode) return 0;

        int leftDist = getKthAncestor(root.left, targetNode, k);
        int rightDist = getKthAncestor(root.right, targetNode, k);

        if (leftDist == -1 && rightDist == -1) return -1;

        int currentDistance = Math.max(leftDist, rightDist) + 1;
        if (currentDistance == k) {
            System.out.println(k + "th Ancestor of " + targetNode + " is: " + root.data);
        }
        return currentDistance;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Tree Height: " + calculateHeight(root));
        System.out.println("Total Nodes: " + countNodes(root));
        System.out.println("Optimized Diameter: " + calculateDiameterOptimized(root).diameter);

        getKthAncestor(root, 5, 2);
    }
}
