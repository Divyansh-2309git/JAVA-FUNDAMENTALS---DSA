# Hashing Overview

## What this topic teaches
Hashing is one of the most fundamental concepts in computer science, enabling average $O(1)$ time complexity for data insertion, deletion, and lookup. This module covers core hashing data structures in Java (`HashMap`, `HashSet`, `LinkedHashMap`, `LinkedHashSet`, `TreeMap`, `TreeSet`), custom HashMap implementation from scratch via Separate Chaining, and classic algorithmic problems solved using hashing techniques.

## Concepts Covered
- **HashMap & HashSet Fundamentals**: $O(1)$ basic operations (put, get, containsKey, remove, add, size, clear).
- **Internal HashMap Mechanics**: Buckets array, hash functions, collision resolution via Separate Chaining, load factor ($\lambda$), and Rehashing.
- **Custom HashMap Implementation**: Building a fully functional generic `HashMap<K, V>` using an array of `LinkedList` buckets.
- **Order Preservation & Sorting**:
  - `LinkedHashMap` & `LinkedHashSet`: Preserving insertion order using doubly-linked lists.
  - `TreeMap` & `TreeSet`: $O(\log N)$ natural key sorting using Red-Black Trees & Self-Balancing BSTs.
- **Iteration Techniques**: Iterating over maps using `keySet()`, `entrySet()`, and sets using `Iterator` or enhanced for-each loops.
- **Classic Hashing Algorithms**:
  - Frequency mapping & Majority Element ($> N/3$).
  - Character frequency counting for Valid Anagram verification.
  - Set operations for Union and Intersection of arrays.
  - Reverse mapping for travel itinerary reconstruction.
  - Prefix Sum hashing for finding the largest subarray with 0 sum.

## Programs Included

| Program | Description |
| :--- | :--- |
| [CountDistinctElements.java](CountDistinctElements.java) | Counts the number of unique elements in an array using HashSet in O(N) time. |
| [HashMaps.java](HashMaps.java) | Demonstrates fundamental HashMap operations (`put`, `get`, `containsKey`, `remove`, `size`, `clear`). |
| [HashSets.java](HashSets.java) | Demonstrates fundamental HashSet operations (`add`, `contains`, `remove`, `size`, `clear`). |
| [ImplementationHashMaps.java](ImplementationHashMaps.java) | Custom HashMap implementation from scratch using LinkedList buckets and dynamic rehashing. |
| [IterationOnHashMaps.java](IterationOnHashMaps.java) | Demonstrates HashMap iteration using `keySet()` and `entrySet()`. |
| [IterationOnHashSets.java](IterationOnHashSets.java) | Demonstrates HashSet iteration using `Iterator` and enhanced for-each loops. |
| [ItineraryForTickets.java](ItineraryForTickets.java) | Reconstructs a complete travel itinerary from flight tickets using HashMap reverse mapping. |
| [LargestSubarrayWithSum0.java](LargestSubarrayWithSum0.java) | Finds the length of the largest contiguous subarray with 0 sum using Prefix Sum and HashMap. |
| [LinkedHashMaps.java](LinkedHashMaps.java) | Demonstrates `LinkedHashMap` preserving insertion order of key-value pairs. |
| [LinkedHashSets.java](LinkedHashSets.java) | Demonstrates `LinkedHashSet` preserving insertion order of unique elements. |
| [MajorityElement.java](MajorityElement.java) | Finds all elements appearing more than $\lfloor N/3 \rfloor$ times using frequency mapping in O(N) time. |
| [TreeMaps.java](TreeMaps.java) | Demonstrates `TreeMap` maintaining sorted keys in $O(\log N)$ time using Red-Black Trees. |
| [TreeSets.java](TreeSets.java) | Demonstrates `TreeSet` maintaining unique elements in sorted order using Self-Balancing BST. |
| [UnionAndIntersection.java](UnionAndIntersection.java) | Computes Union and Intersection of two arrays using HashSet in O(N + M) time. |
| [ValidAnagram.java](ValidAnagram.java) | Verifies if two strings are valid anagrams using character frequency mapping with HashMap. |

## Key Java Concepts
- **Hashing Principle**: Maps object keys to array indices via `hashCode()` and resolves equality using `equals()`.
- **Time Complexities**:
  - `HashMap` / `HashSet`: Average $O(1)$ search, insertion, and deletion.
  - `LinkedHashMap` / `LinkedHashSet`: Average $O(1)$ operations with $O(N)$ insertion-order traversal.
  - `TreeMap` / `TreeSet`: Guaranteed $O(\log N)$ operations due to underlying Red-Black Tree.
- **Load Factor & Rehashing**: When load factor $\lambda = \frac{n}{N} > 2.0$ (or $0.75$ in JCF), the bucket array capacity doubles and all entries are rehashed.

## Common Interview Questions
1. How does `HashMap` handle collisions in Java?
2. What is the contract between `equals()` and `hashCode()` methods?
3. How do `HashMap`, `LinkedHashMap`, and `TreeMap` differ in internal implementation and ordering?
4. How do you find the largest subarray with 0 sum using Prefix Sum and HashMap?

## Common Beginner Mistakes
- Modifying key objects after inserting them into a HashMap, leading to unretrievable values due to hashcode changes.
- Assuming `HashMap` or `HashSet` maintains insertion or sorted order (use `LinkedHashMap`/`TreeMap` instead).
- Forgetting to check edge cases in subarray sum problems (e.g. subarray starting from index 0).

## Real-world Uses
- Caching systems (LRU Cache using LinkedHashMap), database indexing, symbol tables in compilers, frequency analysis, and rapid database lookups.

## Suggested Next Topic
Proceed to **Trie Data Structure** and **Graph Algorithms**.

## Additional Resources
- [Java HashMap Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html)
- [Java HashSet Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html)
