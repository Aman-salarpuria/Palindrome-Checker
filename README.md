# Palindrome-Checker

## Use Case 10: Normalized Palindrome Validation

This use case validates a palindrome after preprocessing the input string.

### Normalization Steps

- **Remove spaces and symbols** using a regular expression.
- **Convert to lowercase** to make comparison case-insensitive.

The normalization expression used is:

```java
input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
```

### Algorithm

- Normalize the input string.
- Use a two-pointer loop from both ends towards the center:
  - Compare characters at symmetric positions.
  - If any pair does not match, it is not a palindrome.
- Otherwise, it is a palindrome.

### Sample Input and Output

Input  : A man a plan a canal Panama  
Is Palindrome? : true

