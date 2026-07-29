# Stacks Overview

## What this topic teaches
A Stack is a LIFO (Last-In, First-Out) data structure. This module covers Stack implementations (using ArrayList, LinkedList, and Java Collection Framework), stack-based algorithm design, monotonic stacks, and expression evaluation.

## Concepts Covered
- LIFO Principle
- Core operations: , , , 
- Implementations: Custom ArrayList Stack, Custom LinkedList Stack, 
- Applications: String Reversal, Stack Reversal, Valid Parentheses, Duplicate Parentheses
- Monotonic Stack problems: Next Greater Element, Stock Span, Maximum Area Histogram

## Programs Included

| Program | Description |
| :--- | :--- |
| [DuplicateParenthesesCheck.java](DuplicateParenthesesCheck.java) | Checks if a balanced expression contains redundant parentheses O(N). |
| [MaxAreaHistogram.java](MaxAreaHistogram.java) | Solves Largest Rectangle in Histogram using Monotonic Stacks O(N). |
| [NextGreaterElement.java](NextGreaterElement.java) | Finds next greater element for each array entry using Monotonic Stack O(N). |
| [PushAtStackBottom.java](PushAtStackBottom.java) | Pushes an element to the bottom of a stack recursively. |
| [ReverseStackRecursive.java](ReverseStackRecursive.java) | Reverses a stack in-place using recursion. |
| [ReverseStringUsingStack.java](ReverseStringUsingStack.java) | Reverses a String using Stack LIFO property. |
| [StackArrayListImplementation.java](StackArrayListImplementation.java) | Custom Stack class using . |
| [StackJCFDemo.java](StackJCFDemo.java) | Standard  usage. |
| [StackLinkedListImplementation.java](StackLinkedListImplementation.java) | Custom Stack class using Singly Linked List. |
| [StockSpanProblem.java](StockSpanProblem.java) | Calculates stock span using a Monotonic Stack O(N). |
| [ValidParenthesesCheck.java](ValidParenthesesCheck.java) | Verifies matching brackets  using Stack O(N). |

## Key Java Concepts
- **LIFO Behavior**: Elements pushed last are popped first.
- **Monotonic Stack**: Stack maintaining elements in strictly increasing or decreasing order.

## Common Interview Questions
1. How do you implement a Stack using Queues?
2. Explain the Next Greater Element algorithm using a Monotonic Stack.

## Suggested Next Topic
Proceed to **Queues**.
