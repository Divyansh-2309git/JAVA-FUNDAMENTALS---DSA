# Binary Search Tree (BST) Overview

## What this topic teaches
A Binary Search Tree (BST) is a node-based binary tree where the left subtree contains values smaller than the root, and the right subtree contains values greater than the root.

## Concepts Covered
- BST Property: 
- Operations: Insertion, Search O(H), Deletion (0, 1, 2 children cases)
- Inorder Traversal yields sorted order
- Range Queries, Root-to-Leaf path printing, Mirror transformation, BST Validation
- Finding Largest BST subtree in a Binary Tree

## Programs Included

| Program | Description |
| :--- | :--- |
| [BSTBasics.java](BSTBasics.java) | Comprehensive BST implementation: creation, search, deletion, range search, path printing, and mirror transformation. |
| [LargestBST.java](LargestBST.java) | Bottom-up postorder traversal to find size of largest BST subtree in a Binary Tree. |

## Key Java Concepts
- **Inorder Successor**: Leftmost node in right subtree used to replace a deleted node with two children.

## Common Interview Questions
1. How do you validate if a Binary Tree is a valid BST?
2. What is the time complexity of searching in a balanced BST vs a skewed BST?

## Suggested Next Topic
Proceed to **Heaps & Priority Queues**.
