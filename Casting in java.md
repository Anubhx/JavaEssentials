# Casting in Java

Casting in Java is a process of converting one data type into another data type. This can be broadly classified into two types: Widening (Implicit) Casting and Narrowing (Explicit) Casting.

## Widening (Implicit) Casting

Widening casting is when you convert a smaller data type to a larger data type. This is done automatically by Java and does not lead to loss of data.

### Example:
```java
public class CastingsInJava {
    public static void main(String[] args) {
        int num2 = 100;
        double num3 = num2; // Implicit casting - converting int to double
        System.out.println("Double value: " + num3); // Output: Double value: 100.0
    }
}
``` 
In the above example, the integer num2 is implicitly cast to a double num3 without any loss of data.

## Narrowing (Explicit) Casting
Narrowing casting is when you convert a larger data type to a smaller data type. This needs to be done manually by placing the type in parentheses before the value. It may lead to loss of data because of truncation.

### Example: 
```java 
public class CastingsInJava {
    public static void main(String[] args) {
        double price1 = 100.50;
        int finalprice1 = (int) price1 + 18; // Explicit casting - converting double to int
        System.out.println("Final Price: " + finalprice1); // Output: Final Price: 118
    }
}
```
In this example, the double price1 is explicitly cast to an integer finalprice1, resulting in the truncation of the decimal part.

## Int to String Conversion
### Example 
```java 
public class CastingsInJava {
    public static void main(String[] args) {
        int num = 100;
        String str = Integer.toString(num) + 10;
        System.out.println("String value: " + str); // Output: String value: 10010
    }
}
```
To convert an integer to a string, you can use the Integer.toString() method. In this example, the integer num is converted to a string and concatenated with 10.

## String to Int Conversion
### Example 
```java
public class CastingsInJava {
    public static void main(String[] args) {
        String str1 = "100";
        int num1 = Integer.parseInt(str1) + 10;
        System.out.println("Int value: " + num1); // Output: Int value: 110
    }
}
```
To convert a string to an integer, you can use the Integer.parseInt() method. In this example, the string str1 is parsed to an integer num1 and added to 10.

### Summary

Casting is an essential concept in Java programming. Understanding the differences between implicit and explicit casting, and how to perform type conversions, is crucial for effective Java programming.
```java 
public class CastingsInJava {
    public static void main(String[] args) {
        double price = 100.50;
        double finalprice = price + 18; // Implicit casting - converting int to double
        System.out.println("Final Price: " + finalprice);

        int num2 = 100;
        double num3 = num2; // Implicit casting - converting int to double
        System.out.println("Double value: " + num3);

        double price1 = 100.50;
        int finalprice1 = (int) price1 + 18; // Explicit casting - converting double to int
        System.out.println("Final Price: " + finalprice1);

        int num = 100;
        String str = Integer.toString(num) + 10;
        System.out.println("String value: " + str);

        String str1 = "100";
        int num1 = Integer.parseInt(str1) + 10;
        System.out.println("Int value: " + num1);
    }
}
```