# ArrayList Overview

## What this topic teaches
 is part of Java's Collection Framework implementing a dynamically resizable array. This module covers dynamic list manipulation, multi-dimensional ArrayLists, and multi-pointer optimization problems.

## Concepts Covered
- Dynamic sizing vs fixed arrays
- CRUD operations: , , , , 
- Multi-dimensional 
- Two-pointer techniques: Container With Most Water, Pair Sum in Sorted & Rotated Arrays

## Programs Included

| Program | Description |
| :--- | :--- |
| [ArrayListBasics.java](ArrayListBasics.java) | Fundamental operations: add, get, remove, set, size, traversal, and reversal. |
| [ContainerWithMostWater.java](ContainerWithMostWater.java) | Two-pointer solution to Container With Most Water problem O(N). |
| [FindMaximum.java](FindMaximum.java) | Traverses ArrayList to find maximum value. |
| [MultiDimensionalArrayList.java](MultiDimensionalArrayList.java) | Creation and iteration over 2D dynamic lists. |
| [PairSumRotated.java](PairSumRotated.java) | Two-pointer search for target sum in a sorted and rotated ArrayList O(N). |
| [PairSumSorted.java](PairSumSorted.java) | Two-pointer search for target sum in a sorted ArrayList O(N). |
| [SortArrayList.java](SortArrayList.java) | Sorts ArrayList using . |
| [SwapElements.java](SwapElements.java) | Swaps two elements in an ArrayList given their indices. |

## Key Java Concepts
- **Wrapper Classes**: Automatic boxing/unboxing between  and .
- **Dynamic Resizing**:  automatically grows by 50% when capacity is reached.

## Common Interview Questions
1. How does  resize dynamically under the hood?
2. What is the difference between  and  in Java?

## Common Beginner Mistakes
- Modifying an  while iterating over it without using an Iterator (causes ).

## Real-world Uses
- Dynamic lists, shopping carts, task queues, and REST API response lists.

## Suggested Next Topic
Proceed to **Object-Oriented Programming (OOPS)**.
