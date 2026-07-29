# Strings Overview

## What this topic teaches
This module explores String manipulation in Java, covering String immutability, memory management (String Constant Pool), methods of the  class, and mutable alternatives like .

## Concepts Covered
- String creation ( literals vs )
- String immutability and String Constant Pool (SCP)
- Equality check ( reference comparison vs  value comparison)
- String traversal (, )
- Substrings and string concatenation
- Efficiency optimization using 

## Programs Included

| Program | Description |
| :--- | :--- |
| [CharAtDemo.java](CharAtDemo.java) | Accesses individual characters in a String using . |
| [LargestStringLexicographical.java](LargestStringLexicographical.java) | Finds the lexicographically largest String using . |
| [PalindromeStringCheck.java](PalindromeStringCheck.java) | Verifies if a string is a palindrome in O(N) time. |
| [StringBasics.java](StringBasics.java) | Input/output operations with Strings ( vs ). |
| [StringBuilderDemo.java](StringBuilderDemo.java) | Demonstrates efficient string concatenation using . |
| [StringCompression.java](StringCompression.java) | Compresses strings using run-length encoding (e.g. ). |
| [StringConcatenation.java](StringConcatenation.java) | Combines strings using the  operator. |
| [StringEqualityDemo.java](StringEqualityDemo.java) | Compares  reference equality versus  value equality. |
| [StringLengthDemo.java](StringLengthDemo.java) | Demonstrates the  method on Strings. |
| [SubstringDemo.java](SubstringDemo.java) | Extracts custom substrings from a parent String. |
| [ToUpperCaseWords.java](ToUpperCaseWords.java) | Capitalizes the first letter of every word in a sentence. |

## Key Java Concepts
- **String Immutability**: Modifying a String creates a new object in memory. Use  when performing repetitive modifications.
- **String Constant Pool**: Memory area inside Java Heap reserved for literal strings to conserve memory.

## Common Interview Questions
1. Why are Strings immutable in Java?
2. What is the difference between , , and ?
3. How does  work for lexicographical sorting?

## Common Beginner Mistakes
- Using  to compare String contents instead of .
- Repeatedly concatenating Strings inside a loop using  (creates O(N^2) memory allocations).

## Real-world Uses
- Text processing, JSON/XML parsing, web form input validation, and user authentication strings.

## Suggested Next Topic
Proceed to **Arrays** and **2D Arrays**.

## Additional Resources
- [Java String Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)
