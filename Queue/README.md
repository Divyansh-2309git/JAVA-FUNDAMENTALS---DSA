# Queues Overview

## What this topic teaches
A Queue is a FIFO (First-In, First-Out) data structure. This module covers Queue implementations (Array, Linked List, Java Collection Framework), Double-Ended Queues (Deque), and queue-based algorithm problems.

## Concepts Covered
- FIFO Principle (, , )
- Array Queue (Circular Queue), Linked List Queue
-  interface and / implementations
- Double-Ended Queue ()
- Queue/Stack Inter-conversions (Queue using 2 Stacks, Stack using 2 Queues, Stack/Queue using Deque)
- Advanced Queue Problems: First Non-Repeating Character in Stream, Queue Reversal, Interleaving Queue halves

## Programs Included

| Program | Description |
| :--- | :--- |
| [DequeDemo.java](DequeDemo.java) | Demonstrates Double-Ended Queue (Deque) operations. |
| [FirstNonRepeatingCharacter.java](FirstNonRepeatingCharacter.java) | Finds first non-repeating character in a stream using Queue O(N). |
| [InterleaveQueueHalves.java](InterleaveQueueHalves.java) | Interleaves first half of a queue with second half. |
| [QueueArrayImplementation.java](QueueArrayImplementation.java) | Custom fixed-size Queue using array. |
| [QueueJCFDemo.java](QueueJCFDemo.java) | Queue usage via Java Collection Framework. |
| [QueueLinkedListImplementation.java](QueueLinkedListImplementation.java) | Custom Queue using Linked List nodes. |
| [QueueUsingDeque.java](QueueUsingDeque.java) | Implements Queue ADT using Deque. |
| [QueueUsingTwoStacks.java](QueueUsingTwoStacks.java) | Implements FIFO Queue using two LIFO Stacks. |
| [ReverseQueue.java](ReverseQueue.java) | Reverses elements in a Queue using a Stack. |
| [StackUsingDeque.java](StackUsingDeque.java) | Implements LIFO Stack ADT using Deque. |
| [StackUsingTwoQueues.java](StackUsingTwoQueues.java) | Implements LIFO Stack using two FIFO Queues. |

## Key Java Concepts
- **Queue vs Deque**:  restricts insertion at tail and removal at head;  allows insertion and removal at both ends.

## Common Interview Questions
1. How do you implement a Queue using two Stacks?
2. What is a Circular Queue and why is it preferred over a linear array queue?

## Suggested Next Topic
Proceed to **Trees & Binary Search Trees**.
