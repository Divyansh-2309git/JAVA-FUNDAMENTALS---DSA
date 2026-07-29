# Bit Manipulation Overview

## What this topic teaches
Bit Manipulation covers low-level binary operations directly operating on integers at the bit level. Bitwise operations provide significant performance benefits, fast arithmetic, and compact space representations.

## Concepts Covered
- Bitwise Operators: , , , , Left Shift (), Right Shift ()
- Bit Masking techniques ()
- Getting, setting, clearing, and toggling specific bit positions
- Checking odd/even numbers using bitwise AND

## Programs Included

| Program | Description |
| :--- | :--- |
| [BitwiseOperatorsDemo.java](BitwiseOperatorsDemo.java) | Demonstrates basic bitwise operations (&, |, ^, ~, <<, >>). |
| [CheckEvenOddBitwise.java](CheckEvenOddBitwise.java) | Determines odd/even status of an integer using bitwise AND (). |
| [GetIthBit.java](GetIthBit.java) | Extracts the bit at index  (0-indexed from LSB) using a bit mask. |
| [SetIthBit.java](SetIthBit.java) | Sets the bit at index  to 1 using bitwise OR (). |

## Key Java Concepts
- **Two's Complement**: Representation of negative numbers in Java integers.
- **Shift Operations**: Left shift () multiplies  by . Right shift () divides  by .

## Common Interview Questions
1. How do you check if a number is a power of 2 using bitwise operators?
2. How do you swap two numbers without using a temporary variable (using XOR)?
3. What is the difference between arithmetic right shift () and logical right shift ()?

## Common Beginner Mistakes
- Misunderstanding operator precedence: bitwise operators have lower precedence than arithmetic operators (always use parentheses: ).
- Confusing logical operators (, ) with bitwise operators (, ).

## Real-world Uses
- Cryptography, hashing functions, network protocol packet processing, and graphics programming.

## Suggested Next Topic
Proceed to **Strings** or **Arrays** for higher-level data structures.

## Additional Resources
- [Java Bitwise & Bit Shift Operators Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html)
