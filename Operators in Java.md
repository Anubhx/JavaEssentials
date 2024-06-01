# Operators in Java

## Introduction

Operators in Java are special symbols that perform specific operations on one, two, or three operands and return a result. This guide provides an in-depth look at various types of operators in Java, including Arithmetic, Relational, Logical, Bitwise, Assignment, Conditional, Unary, and the `instanceof` operator. Each section includes explanations and examples to illustrate their use.

## Types of Operators in Java

### 1. Arithmetic Operators

Arithmetic operators are used to perform basic mathematical operations like addition, subtraction, multiplication, division, modulus, increment, and decrement.

#### Example

```java
public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;
        int sum = num1 + num2; // Addition
        int diff = num1 - num2; // Subtraction
        int product = num1 * num2; // Multiplication
        int div = num1 / num2; // Division
        int mod = num1 % num2; // Modulus
        num1++; // Increment
        num2--; // Decrement

        System.out.println("Sum: " + sum);         // Output: Sum: 150
        System.out.println("Difference: " + diff); // Output: Difference: 50
        System.out.println("Product: " + product); // Output: Product: 5000
        System.out.println("Division: " + div);    // Output: Division: 2
        System.out.println("Modulus: " + mod);     // Output: Modulus: 0
        System.out.println("Increment: " + num1);  // Output: Increment: 101
        System.out.println("Decrement: " + num2);  // Output: Decrement: 49
    }
}
```

### 2. Relational Operators

Relational operators are used to compare two values and determine the relationship between them. These include greater than, less than, greater than or equal to, less than or equal to, equal to, and not equal to.

#### Example

```java
public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int num3 = 100;
        int num4 = 50;

        System.out.println(num3 > num4);  // Output: true
        System.out.println(num3 < num4);  // Output: false
        System.out.println(num3 >= num4); // Output: true
        System.out.println(num3 <= num4); // Output: false
        System.out.println(num3 == num4); // Output: false
        System.out.println(num3 != num4); // Output: true
    }
}
```

### 3. Logical Operators

Logical operators are used to perform logical operations on boolean values. These include AND (`&&`), OR (`||`), and NOT (`!`).

#### Example

```java
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // Output: false
        System.out.println(a || b); // Output: true
        System.out.println(!a);     // Output: false
    }
}
```

### 4. Bitwise Operators

Bitwise operators perform operations on individual bits of integer values. These include AND (`&`), OR (`|`), XOR (`^`), NOT (`~`), left shift (`<<`), and right shift (`>>`).

#### Example

```java
public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int num5 = 5; // Binary: 101
        int num6 = 3; // Binary: 011

        System.out.println(num5 & num6);  // Output: 1  (Binary: 001)
        System.out.println(num5 | num6);  // Output: 7  (Binary: 111)
        System.out.println(num5 ^ num6);  // Output: 6  (Binary: 110)
        System.out.println(~num5);        // Output: -6 (Binary: ...11111010)
        System.out.println(num5 << 1);    // Output: 10 (Binary: 1010)
        System.out.println(num5 >> 1);    // Output: 2  (Binary: 010)
    }
}
```

### 5. Assignment Operators

Assignment operators are used to assign values to variables. These include `=`, `+=`, `-=`, `*=`, `/=`, and `%=`.

#### Example

```java
public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int num7 = 10;
        num7 += 5; // Equivalent to num7 = num7 + 5
        System.out.println(num7); // Output: 15

        final int num8 = 10;
        // num8 += 5; // Error: Cannot assign a value to a final variable
    }
}
```

### 6. Conditional Operator (Ternary Operator)

The conditional operator evaluates a boolean expression and returns one of two values based on the result.

#### Example

```java
public class ConditionalOperatorExample {
    public static void main(String[] args) {
        int num9 = 10;
        int num10 = 20;
        int result = (num9 > num10) ? num9 : num10;
        System.out.println("Result: " + result); // Output: 20
    }
}
```

### 7. Unary Operators

Unary operators perform operations on a single operand. These include increment (`++`), decrement (`--`), positive (`+`), and negative (`-`).

#### Example

```java
public class UnaryOperatorsExample {
    public static void main(String[] args) {
        int num11 = 10;
        int num12 = -10;

        System.out.println(num11++); // Output: 10 (Post-increment)
        System.out.println(num11);   // Output: 11
        System.out.println(++num11); // Output: 12 (Pre-increment)
        System.out.println(num11);   // Output: 12
        System.out.println(num12--); // Output: -10 (Post-decrement)
        System.out.println(num12);   // Output: -11
        System.out.println(--num12); // Output: -12 (Pre-decrement)
        System.out.println(num12);   // Output: -12
        System.out.println(+num11);  // Output: 12 (Positive)
        System.out.println(-num11);  // Output: -12 (Negative)
    }
}
```

### 8. `instanceof` Operator

The `instanceof` operator checks if an object is an instance of a particular class or interface.

#### Example

```java
public class InstanceofOperatorExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String); // Output: true
    }
}
```

### 9. Operator Precedence

Operator precedence determines the order in which operators are evaluated in an expression. Operators with higher precedence are evaluated first. If operators have the same precedence, they are evaluated from left to right.

#### Example

```java
public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int num13 = 10;
        int num14 = 20;
        int num15 = 30;
        int result1 = num13 + num14 * num15;

        System.out.println("Result1: " + result1); // Output: 610
        // Multiplication (*) has higher precedence than addition (+)
    }
}
```

## Conclusion

Understanding operators is fundamental to mastering Java programming. This guide provides a comprehensive overview of various operators in Java, complete with examples to illustrate their use. By grasping these concepts, you will be better equipped to write efficient and effective Java code.