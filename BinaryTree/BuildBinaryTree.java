/**
 * Program Name : BuildBinaryTree
 * Topic        : Binary Tree
 * Difficulty   : Intermediate
 * Concepts     : Tree Preorder Construction, Level Order Traversal, Queue-based BFS
 * -------------------------------------------------------------
 * Description  :
 * Builds a Binary Tree from a preorder sequence containing -1 for null nodes,
 * and performs level-order traversal (BFS) using a Queue.
 */
import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree {

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

    static class BinaryTreeBuilder {
        private static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void levelOrderTraversal(Node root) {
            if (root == null) return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null); // Level marker

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTreeBuilder.buildTree(nodes);

        System.out.println("Level Order Traversal of constructed Binary Tree:");
        BinaryTreeBuilder.levelOrderTraversal(root);
    }
}
