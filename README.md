````md
# Use Case 7: Deque Based Optimized Palindrome Checker

## Overview

This program checks whether a given string is a palindrome using a Deque (Double Ended Queue).

A palindrome is a word that reads the same forward and backward.

Example:
- refer

---

## Core Concept

A Deque allows insertion and removal of elements from both the front and rear.

Methods used:
- removeFirst()
- removeLast()

This enables direct comparison of the first and last characters without using separate data structures like Stack or Queue.

---

## Logic Flow

### 1. Define Input

```java
String input = "refer";
````

The string to be validated is initialized.

---

### 2. Create Deque

```java
Deque<Character> deque = new ArrayDeque<>();
```

A Deque is created to store characters.

---

### 3. Insert Characters

```java
for (char c : input.toCharArray()) {
    deque.add(c);
}
```

All characters are inserted into the deque.

---

### 4. Compare Front and Rear

```java
while (deque.size() > 1) {
    char first = deque.removeFirst();
    char last = deque.removeLast();

    if (first != last) {
        isPalindrome = false;
        break;
    }
}
```

* Remove the first and last characters.
* Compare them.
* Continue until the deque has zero or one element left.

If any pair does not match, the string is not a palindrome.

---

## Why This Approach Is Optimized

* No extra data structure for reversal
* Direct front and rear access
* Efficient symmetric comparison

---

## Time and Space Complexity

Time Complexity: O(n)
Space Complexity: O(n)

```
```
