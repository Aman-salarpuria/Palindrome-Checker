# Use Case 8: Linked List Based Palindrome Checker

## Overview

This program checks whether a string is a palindrome using a Linked List.

A palindrome reads the same forward and backward.

Example:
level

---

## Core Concept

The string is converted into a linked list of characters.

Comparison is done by removing elements from:
- The front
- The rear

If all corresponding elements match, the string is a palindrome.

---

## Logic Flow

1. Convert string into LinkedList.
2. Repeatedly remove first and last elements.
3. Compare both values.
4. Stop if mismatch occurs.

If the list reduces to one or zero elements, the string is a palindrome.

---

## Time and Space Complexity

Time Complexity: O(n)  
Space Complexity: O(n)