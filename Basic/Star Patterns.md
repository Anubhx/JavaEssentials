# Star Patterns in Java

## Introduction

Star patterns are a common exercise in programming to understand the use of loops, conditional statements, and iteration. They are widely used in coding interviews and practice problems to test a programmer's logical thinking and problem-solving skills.

## Why Learn Star Patterns?

Learning star patterns helps in:
1. **Understanding Loops**: Star patterns require nested loops to iterate through rows and columns, providing a solid understanding of how loops work.
2. **Logical Thinking**: Creating different patterns requires logical reasoning and enhances problem-solving skills.
3. **Mastering Syntax**: Regular practice with patterns helps in mastering the syntax of the programming language.
4. **Preparation for Interviews**: Many coding interviews include pattern-related questions to evaluate a candidate's logic and coding skills.

## Various Star Patterns

### 1. Right-Angled Triangle

```
*
**
***
****
*****
```

**Code:**

```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 2. Inverted Right-Angled Triangle

```
*****
****
***
**
*
```

**Code:**

```java
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 3. Pyramid

```
    *
   ***
  *****
 *******
*********
```

**Code:**

```java
for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 4. Inverted Pyramid

```
*********
 *******
  *****
   ***
    *
```

**Code:**

```java
for (int i = n; i >= 1; i--) {
    for (int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 5. Diamond

```
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
```

**Code:**

```java
for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = n; i >= 1; i--) {
    for (int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 6. Right-Angled Triangle (Mirrored)

```
    *
   **
  ***
 ****
*****
```

**Code:**

```java
for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 7. Sandglass

```
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
```

**Code:**

```java
for (int i = n; i >= 1; i--) {
    for (int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = 2; i <= n; i++) {
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

## Conclusion

Practicing star patterns can greatly enhance your understanding of loops and improve your problem-solving abilities. Keep experimenting with different patterns to further develop your skills.
```
