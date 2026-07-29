# Heaps & Priority Queues Overview

## What this topic teaches
A Heap is a complete binary tree satisfying the heap property (Min-Heap: parent <= children; Max-Heap: parent >= children).  is Java's Collection framework implementation of a heap.

## Concepts Covered
- Complete Binary Tree array representation (, , )
- Min-Heap and Max-Heap properties
- Up-Heapify (percolate up) on insertion O(log N)
-  usage with Primitives and Custom Objects ( interface)

## Programs Included

| Program | Description |
| :--- | :--- |
| [MinHeapInsertion.java](MinHeapInsertion.java) | Custom Min-Heap class implementing  with up-heapify. |
| [PriorityQueueCustomObjects.java](PriorityQueueCustomObjects.java) |  storing custom Student objects implementing . |
| [PriorityQueueDemo.java](PriorityQueueDemo.java) | Built-in  with  for Max-Heap behavior. |

## Key Java Concepts
- **Comparable vs Comparator**:  defines natural ordering ();  defines custom external ordering.

## Common Interview Questions
1. How does a Min-Heap support insert and delete-min in O(log N) time?
2. What is the difference between  and  in Java?

## Suggested Next Topic
Proceed to **LeetCode Solutions** and **Practice Problems**.
