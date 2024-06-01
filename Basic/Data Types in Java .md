# Java Data Types

## Introduction

In Java, data types specify the different sizes and values that variables can hold. Java is a strongly typed language, which means every variable must be declared with a data type.

Java data types can be categorized into two types:

1. **Primitive Data Types**
2. **Non-Primitive Data Types**

## Primitive Data Types

Primitive data types are predefined by the Java language and named by a reserved keyword.

### 1. byte

- **Size:** 8-bit
- **Range:** -128 to 127
- **Default Value:** 0
- **Usage:** To save memory in large arrays where the memory savings actually matters.

```java
byte age = 30;
```

### 2. short

- **Size:** 16-bit
- **Range:** -32,768 to 32,767
- **Default Value:** 0
- **Usage:** To save memory in large arrays, slightly more efficient than `byte`.

```java
short temperature = 250;
```

### 3. int

- **Size:** 32-bit
- **Range:** -2^31 to 2^31-1
- **Default Value:** 0
- **Usage:** Default data type for integral values unless there is a concern about memory.

```java
int phoneNumber = 1234567890;
```

### 4. long

- **Size:** 64-bit
- **Range:** -2^63 to 2^63-1
- **Default Value:** 0L
- **Usage:** When a wider range than `int` is needed.

```java
long bigNumber = 12345678990L;
```

### 5. float

- **Size:** 32-bit
- **Range:** Varies
- **Default Value:** 0.0f
- **Usage:** Use this when you need a fractional number and memory savings are important.

```java
float pi = 3.14F;
```

### 6. double

- **Size:** 64-bit
- **Range:** Varies
- **Default Value:** 0.0d
- **Usage:** Default data type for decimal values.

```java
double decimalValue = 3.123;
```

### 7. char

- **Size:** 16-bit
- **Range:** '\u0000' (0) to '\uffff' (65,535)
- **Default Value:** '\u0000'
- **Usage:** Used to store any character.

```java
char letter = '@';
```

### 8. boolean

- **Size:** Depends on the JVM
- **Values:** true or false
- **Default Value:** false
- **Usage:** For simple flags that track true/false conditions.

```java
boolean isAdult = true;
```

## Non-Primitive Data Types

Non-primitive data types are also called reference types because they refer to objects. They include classes, interfaces, and arrays.

### 1. Strings

- **Usage:** To store a sequence of characters.
- **Special Note:** Strings are immutable in Java.

```java
String name = "Anubhav";
System.out.println("Name: " + name);
```

#### Common String Methods:

- **Concatenation:** Using `+` operator or `concat()` method.
- **charAt():** Returns the character at a specified index.
- **length():** Returns the length of the string.
- **replace():** Replaces each occurrence of a character with another character.
- **substring():** Extracts a substring from the string.

```java
String firstName = "Anubhav";
String lastName = "Raj";
String fullName = firstName + " " + lastName;  // Using + operator
String fullName2 = firstName.concat(" ").concat(lastName);  // Using concat() method
System.out.println("Full Name: " + fullName);
System.out.println("Full Name (using concat): " + fullName2);
System.out.println("First character of the name: " + name.charAt(0));
System.out.println("Length of the name: " + name.length());
System.out.println("New String: " + name.replace('A', 'B'));
System.out.println("Substring: " + name.substring(1, 5));
```

### 2. Arrays

- **Usage:** To store multiple values of the same type in a single variable.
- **Special Note:** Arrays in Java are objects and are dynamically allocated.

#### One-Dimensional Arrays:

```java
int[] numbers = {90, 85, 88, 92, 78};
int[] marks = new int[6];
marks[0] = 90;
marks[1] = 85;
marks[2] = 88;
marks[3] = 92;
marks[4] = 78;
System.out.println("Marks array: " + Arrays.toString(marks));
```

#### Two-Dimensional Arrays:

```java
int[][] marks = {
    {90, 85, 88, 92, 78},
    {92, 88, 78, 85, 90}
};
System.out.println("Element at marks[1][0]: " + marks[1][0]);
System.out.println("First row: " + Arrays.toString(marks[0]));
System.out.println("Second row: " + Arrays.toString(marks[1]));
for (int i = 0; i < marks.length; i++) {
    for (int j = 0; j < marks[i].length; j++) {
        System.out.print(marks[i][j] + " ");
    }
    System.out.println();
}
System.out.println("Full marks array using Arrays.deepToString(): " + Arrays.deepToString(marks));
```

#### Tips for Working with 2D Arrays:

1. **Declaration:** 
   - Syntax: `int[][] arrayName = new int[rows][columns];`
   - Alternative: `int[][] arrayName = { {row1}, {row2}, ... };`
2. **Accessing Elements:** 
   - Use `arrayName[rowIndex][colIndex]`, where indices start from 0.
3. **Iterating Through 2D Arrays:** 
   - Use nested loops to iterate through each element.
4. **Printing 2D Arrays:** 
   - Use `Arrays.toString(arrayName[row])` to print a specific row.
   - Use `Arrays.deepToString(arrayName)` to print the entire 2D array.
5. **Common Operations:** 
   - Transposing, rotating, and summing elements in rows or columns are common operations.
6. **Memory Considerations:** 
   - 2D arrays in Java are arrays of arrays, meaning each "row" is actually a reference to another array.
7. **Initialization:** 
   - If not explicitly initialized, 2D arrays of primitive types will be filled with their default values (e.g., 0 for int).

## Conditional Statements in Java

Conditional statements are used to perform different actions based on different conditions.

### 1. If Statement

```java
int age = 30;
if (age >= 18) {
    System.out.println("You are eligible to vote");
}
```

### 2. If-Else Statement

```java
boolean day = true;
if (day) {
    System.out.println("It's a good day");
} else {
    System.out.println("It's a bad day");
}
```

### 3. If-Else-If Statement

```java
int marks = 85;
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
```

### 4. Switch Statement

```java
int day = 4;
switch (day) {
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
```

### 5. Ternary Operator

```java
int age = 30;
String eligibility = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
System.out.println(eligibility);
```

## Conclusion

Understanding Java data types is fundamental for programming in Java. 
This guide covers both primitive and non-primitive data types, their usage, and common operations. 
With this knowledge, you can efficiently handle data in your Java programs.