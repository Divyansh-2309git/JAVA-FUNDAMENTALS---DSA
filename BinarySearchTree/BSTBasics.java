/**
 * Program Name : BSTBasics
 * Topic        : Binary Search Tree (BST)
 * Difficulty   : Intermediate
 * Concepts     : BST Creation, Search, Deletion, Inorder Traversal, Range Search, Root-to-Leaf Paths, Mirroring
 * -------------------------------------------------------------
 * Description  :
 * Fundamental operations on Binary Search Tree (BST):
 * - Insertion & Creation from sorted array
 * - Inorder traversal (yields sorted sequence)
 * - BST Search, Node Deletion (handling 0, 1, 2 children)
 * - Range queries & Root-to-Leaf path printing
 * - BST Validation & Mirror transformation
 */
import java.util.ArrayList;

public class BSTBasics {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Inserts a value into BST maintaining BST property.
     */
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    /**
     * Inorder traversal prints elements in ascending sorted order.
     */
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /**
     * Searches for a key in O(H) time.
     */
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * Deletes a node with value 'val' from the BST.
     */
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // Case 1: Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Single Child
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }

            // Case 3: Two Children (Replace with Inorder Successor - leftmost in right subtree)
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    /**
     * Prints all nodes whose values fall in range [k1, k2].
     */
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    /**
     * Prints root to leaf paths.
     */
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            for (int val : path) {
                System.out.print(val + "-> ");
            }
            System.out.println("null");
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    /**
     * Validates if a binary tree satisfies BST property.
     */
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    /**
     * Mirrors a BST by swapping left and right subtrees recursively.
     */
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    /**
     * Creates a balanced BST from a sorted array.
     */
    public static Node createBST(int[] arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] values = {3, 5, 6, 8, 10, 11, 12};
        System.out.print("Creating Balanced BST from sorted array: ");
        Node root = createBST(values, 0, values.length - 1);
        inorder(root);
        System.out.println();
    }
}
