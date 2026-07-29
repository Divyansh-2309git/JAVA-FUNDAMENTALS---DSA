# Sorting Algorithms Overview

## What this topic teaches
Sorting arranges array elements in a specific order (ascending or descending). This module demonstrates classic elementary sorting algorithms (Bubble Sort, Selection Sort, Counting Sort) and Java's native sorting mechanisms.

## Concepts Covered
- Bubble Sort: Adjacent element comparison and swapping O(N^2)
- Selection Sort: Finding minimum element and placing at front O(N^2)
- Counting Sort: Non-comparison frequency-based sorting O(N + K)
- Inbuilt Sorting:  and 

## Programs Included

| Program | Description |
| :--- | :--- |
| [BubbleSort.java](BubbleSort.java) | Sorts array using adjacent swaps in O(N^2) time. |
| [CountingSort.java](CountingSort.java) | Non-comparison sort for non-negative integers in O(N + K) time. |
| [InbuiltSort.java](InbuiltSort.java) | Uses Java's built-in  for ascending and descending sorts. |
| [SelectionSort.java](SelectionSort.java) | Repeatedly selects minimum element and swaps into sorted portion. |

## Key Java Concepts
- **Inbuilt Dual-Pivot Quicksort**:  uses Dual-Pivot Quicksort for primitives O(N log N).
- **Comparators**:  requires Object wrappers (e.g. ).

## Common Interview Questions
1. Compare Bubble Sort vs Selection Sort vs Insertion Sort in terms of swaps.
2. When is Counting Sort preferred over Comparison-based sorts?

## Common Beginner Mistakes
- Passing primitive  to  (must use ).

## Real-world Uses
- E-commerce product sorting (by price, rating), database index sorting, and ranking leaderboards.
