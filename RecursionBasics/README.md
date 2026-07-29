# Recursion Basics Overview

## What this topic teaches
Recursion is a programming technique where a method calls itself to solve smaller sub-problems. This module builds strong recursive thinking, covering base cases, call stack unwinding, array operations, and classic recursive problems.

## Concepts Covered
- Base Cases and Stack Overflow prevention
- Call stack execution and activation records
- Head vs Tail recursion
- Recursive array search (First and Last occurrences, Is Array Sorted)
- Combinatorial recursion (Friends Pairing, Binary Strings without consecutive 1s)

## Programs Included

| Program | Description |
| :--- | :--- |
| [BinaryStringsNoConsecutiveOnes.java](BinaryStringsNoConsecutiveOnes.java) | Generates binary strings of length N with no consecutive 1s. |
| [FirstOccurrence.java](FirstOccurrence.java) | Finds first occurrence index of a key in an array recursively. |
| [FriendsPairingProblem.java](FriendsPairingProblem.java) | Calculates ways N friends can remain single or pair up recursively. |
| [IsArraySortedRecursive.java](IsArraySortedRecursive.java) | Checks if an array is sorted in ascending order using recursion. |
| [LastOccurrence.java](LastOccurrence.java) | Finds last occurrence index of a key in an array recursively. |
| [PrintDecreasingNumbers.java](PrintDecreasingNumbers.java) | Recursively prints numbers from N down to 1. |
| [PrintIncreasingNumbers.java](PrintIncreasingNumbers.java) | Recursively prints numbers from 1 up to N. |
| [RecursiveFactorial.java](RecursiveFactorial.java) | Computes factorial of N using recursion O(N). |
| [RecursiveFibonacci.java](RecursiveFibonacci.java) | Computes N-th Fibonacci number recursively O(2^N). |
| [RemoveDuplicatesString.java](RemoveDuplicatesString.java) | Removes duplicate characters from a string using boolean tracking. |
| [SumNaturalNumbers.java](SumNaturalNumbers.java) | Computes sum of first N natural numbers recursively. |

## Key Java Concepts
- **Call Stack**: Every recursive invocation pushes a new stack frame containing local variables onto the call stack.
- **StackOverflowError**: Occurs when recursion lacks a valid base case or exceeds maximum stack depth.

## Common Interview Questions
1. How do you convert a recursive algorithm to an iterative one using a Stack?
2. What is the time and space complexity of recursive Fibonacci without memoization?

## Common Beginner Mistakes
- Missing or incorrectly defined base cases leading to infinite recursion.
- Modifying static/global state inside recursive functions leading to side effects.

## Real-world Uses
- Tree and Graph traversals (DFS), mathematical computations, and divide-and-conquer algorithms.

## Suggested Next Topic
Proceed to **Divide & Conquer** and **Backtracking**.
