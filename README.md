````md
# Use Case 6: Queue + Stack Fairness Check

## Overview

This program checks whether a given string is a palindrome using two data structures:

- Queue (FIFO – First In First Out)
- Stack (LIFO – Last In First Out)

A palindrome is a word that reads the same forward and backward.

Examples:
- civic
- level
- noon

---

## Core Concept

This implementation combines the behavior of two data structures:

### Queue (FIFO)

A Queue follows the First In First Out principle.
The first character inserted is the first one removed.

### Stack (LIFO)

A Stack follows the Last In First Out principle.
The last character inserted is the first one removed.

By inserting characters into both structures and then removing them simultaneously, we compare:

- The front character (from the queue)
- The last character (from the stack)

If they are always equal, the string is a palindrome.

---

## Step-by-Step Logic

### 1. Define Input

```java
String input = "civic";
````

The string to validate is initialized.

---

### 2. Create Data Structures

```java
Queue<Character> queue = new LinkedList<>();
Stack<Character> stack = new Stack<>();
```

* The queue stores characters in original order.
* The stack stores characters in reverse order due to LIFO behavior.

---

### 3. Insert Characters

```java
for (char c : input.toCharArray()) {
    queue.add(c);
    stack.push(c);
}
```

Each character is added to both the queue and the stack.

---

### 4. Assume It Is a Palindrome

```java
boolean isPalindrome = true;
```

We initially assume the string is a palindrome.

---

### 5. Compare Characters

```java
while (!queue.isEmpty()) {
    char fromQueue = queue.remove();
    char fromStack = stack.pop();

    if (fromQueue != fromStack) {
        isPalindrome = false;
        break;
    }
}
```

* Characters are removed from the queue (front).
* Characters are popped from the stack (top).
* If any pair does not match, the string is not a palindrome.

---

### 6. Display Result

```java
System.out.println("Input : " + input);
System.out.println("Is Palindrome? : " + isPalindrome);
```

The program prints the input and whether it is a palindrome.

---

## Why This Approach Works

The queue preserves the original order of characters.
The stack reverses the order of characters.

Comparing both simultaneously performs a symmetric check:

* First character vs last character
* Second character vs second-last character
* And so on

This demonstrates how FIFO and LIFO behaviors can be combined for symmetric comparison.

---

## Time and Space Complexity

Time Complexity: O(n)

* One pass to insert
* One pass to compare

Space Complexity: O(n)

* Queue stores n characters
* Stack stores n characters
```
