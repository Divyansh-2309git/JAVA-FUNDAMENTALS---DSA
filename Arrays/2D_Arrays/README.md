# 2D Arrays Overview

## What this topic teaches
2D Arrays (Matrices) represent tabular data arranged in rows and columns. This sub-module covers matrix creation, 2D traversal, diagonal sum calculations, spiral matrix traversal, and staircase search in sorted matrices.

## Concepts Covered
- 2D Array allocation ()
- Row-major traversal and nested loops
- Diagonal sum calculation (Primary and Secondary diagonals)
- Spiral matrix traversal logic
- Staircase search in row-wise and column-wise sorted matrices O(N + M)

## Programs Included

| Program | Description |
| :--- | :--- |
| [DiagonalSum.java](DiagonalSum.java) | Calculates sum of primary and secondary diagonals in O(N) time. |
| [MatrixBasics.java](MatrixBasics.java) | Matrix creation, element input via Scanner, and key search. |
| [SearchInSortedMatrix.java](SearchInSortedMatrix.java) | Staircase search algorithm in a sorted matrix in O(N + M) time. |
| [SpiralMatrix.java](SpiralMatrix.java) | Prints matrix elements in boundary-based spiral order. |

## Key Java Concepts
- **Jagged Arrays**: Java 2D arrays are arrays of arrays, allowing rows of varying lengths.
- **Row-Major Storage**: Matrix elements are stored row by row in memory.

## Common Interview Questions
1. How do you search an element in a row-wise and column-wise sorted 2D matrix?
2. Explain the boundary pointer logic for Spiral Matrix Traversal.

## Common Beginner Mistakes
- Transposing row and column indices ( instead of ).
- Overcounting center element in odd-dimensional matrix diagonal sums.

## Real-world Uses
- Image processing (2D pixel grids), game board representation (Chess, Tic-Tac-Toe), and spreadsheet engines.

## Suggested Next Topic
Proceed to **Sorting Algorithms**.
