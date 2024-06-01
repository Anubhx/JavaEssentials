# Conditional Statements in Java

## Introduction

Conditional statements in Java are used to perform different actions based on different conditions. This guide provides an in-depth look at various types of conditional statements in Java, including `if`, `if-else`, `if-else-if`, `switch`, and the ternary operator. Each section includes explanations and examples to illustrate their use.

## Types of Conditional Statements in Java

### 1. If Statement

The `if` statement is used to execute a block of code if a specified condition is true.

#### Example

```java
import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        // Output if age is 18 or more: You are eligible to vote
    }
}
```

### 2. If-Else Statement

The `if-else` statement is used to execute one block of code if a specified condition is true and another block of code if it is false.

#### Example

```java
public class IfElseStatementExample {
    public static void main(String[] args) {
        boolean day = true;
        if (day) {
            System.out.println("It's a good day");
        } else {
            System.out.println("It's a bad day");
        }
        // Output: It's a good day
    }
}
```

### 3. If-Else-If Statement

The `if-else-if` statement is used to test multiple conditions. If one of the conditions is true, the corresponding block of code is executed.

#### Example

```java
import java.util.Scanner;

public class IfElseIfStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B Grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        } else {
            System.out.println("A+ Grade");
        }
        // Output example if marks are 85: A Grade
    }
}
```

### 4. Switch Statement

The `switch` statement is used to execute one statement from multiple conditions. It works with byte, short, int, long, enum types, String, and some wrapper types like Byte, Short, Integer, and Long.

#### Example

```java
import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
        // Output example if dayNumber is 3: Tuesday
        sc.close();
    }
}
```

### 5. Ternary Operator

The ternary operator is a shorthand for the `if-else` statement. It is used to evaluate a boolean expression and return one of two values based on the result.

#### Example

```java
public class TernaryOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Result: " + result); // Output: 20
    }
}
```

## Conclusion

Understanding conditional statements is essential for controlling the flow of a Java program. This guide provides a comprehensive overview of various conditional statements in Java, complete with examples to illustrate their use. By mastering these concepts, you will be able to write more complex and flexible Java programs.