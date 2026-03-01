# Palindrome-Checker

## Use Case 9: Recursive Palindrome Checker

This use case validates whether a string is a palindrome using **recursion**.

### Flow

- **Step 1**: Hardcode the input string as `"madam"`.
- **Step 2**: Call a recursive `check(String s, int start, int end)` method.
- **Step 3**: In each recursive call:
  - Compare characters at `start` and `end`.
  - If they differ, return `false`.
  - If `start >= end`, return `true` (base case).
- **Step 4**: Print the original input and the boolean result.

### Sample Output

Input  : madam  
Is Palindrome? : true

