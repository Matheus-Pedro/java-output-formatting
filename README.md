# Java's `System.out.printf` Function

Java's `System.out.printf` function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using `printf`.

## Objective

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

---

## Input Format

Every line of input will contain:
- A **String**, followed by an **integer**.

### Constraints:
- Each **String** will have a maximum of 10 alphabetic characters.
- Each **integer** will be in the inclusive range from 0 to 999.

---

## Output Format

For each line of output:
1. The **first column** contains the String and is left-justified using exactly 15 characters.
2. The **second column** contains the integer, expressed in exactly 3 digits.
   - If the original input has less than 3 digits, the output must pad the leading digits with zeroes.

---

## Sample Input
```
java 100
cpp 65
python 50
```

---

## Sample Output
```
================================
java           100
cpp            065
python         050
================================
```

---

## Explanation

- Each **String** is left-justified with trailing whitespace to fit within the first 15 characters.
- Each **integer** is zero-padded to ensure it always has exactly 3 digits.

For example:
- The String `java` is followed by the integer `100`, aligned as:
  ```
  java           100
  ```
- The String `cpp` is followed by the integer `65`, which becomes `065` due to zero-padding:
  ```
  cpp            065
  ```

The output ensures consistent alignment for readability.

