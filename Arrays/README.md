# Arrays Overview

## What this topic teaches
Arrays are fundamental linear data structures storing fixed-size collections of elements of the same data type in contiguous memory locations. This module covers array creation, traversal, subarray techniques, searching algorithms, and classic optimization problems.

## Concepts Covered
- Array initialization, index-based access, and heap allocation
- Pass-by-reference behavior of arrays in Java methods
- Searching algorithms: Linear Search O(N), Binary Search O(log N)
- Subarrays and Subarray sums (Brute force, Prefix Sum array, Kadane's Algorithm)
- Complex array problems: Trapping Rainwater, Buy & Sell Stock

## Programs Included

| Program | Description |
| :--- | :--- |
| [ArrayBasics.java](ArrayBasics.java) | Demonstrates array declaration, initialization, and pass-by-reference. |
| [ArrayPairs.java](ArrayPairs.java) | Generates all possible unique pairs of elements in an array. |
| [BinarySearch.java](BinarySearch.java) | Efficient search on sorted arrays in O(log N) time. |
| [BuyAndSellStocks.java](BuyAndSellStocks.java) | Calculates maximum profit achievable from stock price array. |
| [LargestNumber.java](LargestNumber.java) | Finds maximum and minimum values in an integer array. |
| [LinearSearch.java](LinearSearch.java) | Sequential element search in O(N) time. |
| [MaxSubArrays.java](MaxSubArrays.java) | Generates all contiguous subarrays and computes maximum sum (Brute force). |
| [MaxSumSubarrayKadanes.java](MaxSumSubarrayKadanes.java) | Optimized O(N) maximum subarray sum using Kadane's Algorithm. |
| [MaxSumSubarrayPrefix.java](MaxSumSubarrayPrefix.java) | Computes maximum subarray sum in O(N^2) using a Prefix Sum array. |
| [PrintSubarrays.java](PrintSubarrays.java) | Prints all contiguous subarrays of an array. |
| [ReverseArray.java](ReverseArray.java) | Inverts array element order in-place using two pointers. |
| [TrappingRainwater.java](TrappingRainwater.java) | Solves classic Trapping Rainwater problem in O(N) time and auxiliary space. |

## Key Java Concepts
- **Contiguous Memory Allocation**: Elements are located next to each other in memory, providing O(1) random access by index.
- **ArrayIndexOutOfBoundsException**: Accessing index  or  throws a runtime exception.

## Common Interview Questions
1. Explain Kadane's algorithm for Maximum Subarray Sum.
2. How does Binary Search achieve O(log N) complexity?
3. What is the Trapping Rainwater problem and how do auxiliary left/right max arrays help?

## Common Beginner Mistakes
- Confusing array index (0 to N-1) with length (N).
- Off-by-one errors in loop boundaries ().

## Real-world Uses
- Image pixel manipulation, buffer storage, dataset collections, and lookup tables.

## Suggested Next Topic
Proceed to **2D Arrays** and **Sorting Algorithms**.

## Additional Resources
- [Java Arrays Guide](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
