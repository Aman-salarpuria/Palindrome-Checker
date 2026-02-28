````md
# Use Case 5: Stack Based Palindrome Checker

## 📌 Overview

This program checks whether a given string is a **palindrome** using a **Stack** data structure.

A **palindrome** is a word that reads the same forward and backward.

**Examples:**
- `noon` 
- `madam`
- `hello`

---

## 🧠 Core Concept Used

### Stack (LIFO Principle)

A **Stack** follows the **LIFO (Last In, First Out)** principle.

- The last element pushed into the stack is the first one removed.
- This behavior naturally reverses the order of elements.

We use this property to reverse the string and compare it with the original.

---

## ⚙️ Step-by-Step Logic

### Initialize the Input
```java
String input = "noon";
````

We declare and initialize the string that needs to be checked.

---

###  Create a Stack

```java
Stack<Character> stack = new Stack<>();
```

We create a stack to store each character of the string.

---

### Push Characters into the Stack

```java
for (char c : input.toCharArray()) {
    stack.push(c);
}
```

Each character of the string is pushed into the stack.

Because of LIFO behavior, the stack now holds the characters in reverse order internally.

---

### Assume It Is a Palindrome

```java
boolean isPalindrome = true;
```

We initially assume the string is a palindrome.

---

###  Compare by Popping

```java
for (char c : input.toCharArray()) {
    if (c != stack.pop()) {
        isPalindrome = false;
        break;
    }
}
```

* We iterate through the original string again.
* Each character is compared with the character popped from the stack.
* Since the stack pops in reverse order, this effectively compares:

  * First character with last
  * Second with second-last
  * And so on

If any mismatch occurs, it is not a palindrome.

---

### 6️⃣ Display the Result

```java
if (isPalindrome) {
    System.out.println(input + " is a Palindrome.");
} else {
    System.out.println(input + " is NOT a Palindrome.");
}
```

The result is printed based on the comparison outcome.

---

## 🔍 Why Stack Works Here

The stack automatically reverses the string due to its LIFO nature.

Instead of manually reversing the string:

* We push characters
* We pop them in reverse order
* We compare with the original

This demonstrates how stack behavior maps directly to reversal logic.

---

## 🏁 Time & Space Complexity

* **Time Complexity:** O(n)

  * One pass to push
  * One pass to compare

* **Space Complexity:** O(n)

  * Stack stores all characters

---