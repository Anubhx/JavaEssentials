// Java program to demonstrate the use of loops in Java

public class LoopsInJava {
    public static void main(String[] args) {
        
        // Loops in Java
        // Loops in Java are used to execute a block of code repeatedly until a certain condition is met.
        // Java supports the following types of loops:
        // 1. For Loop
        // 2. While Loop
        // 3. Do-While Loop
        // 4. For-Each Loop
        System.out.println("Example of for loop");
        // For Loop
        // The for loop in Java is used to iterate a block of code a specific number of times.
        // The syntax of the for loop is:
        // for (initialization; condition; increment/decrement) {
        //     // code to be executed
        // }
        
        // Printing numbers from 1 to 5 using a for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        System.out.println("Example of for loop with a break statement");
        // While Loop
        // The while loop in Java is used to iterate a block of code as long as the condition is true.
        // The syntax of the while loop is:
        // while (condition) {
        //     // code to be executed
        // }
        
        // Printing numbers from 1 to 5 using a while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        System.out.println("Example of while loop with a break statement");
        // Do-While Loop
        // The do-while loop in Java is similar to the while loop, but the condition is checked after the block of code is executed.
        // The syntax of the do-while loop is:
        // do {
        //     // code to be executed
        // } while (condition);
        
        // Printing numbers from 1 to 5 using a do-while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        
        // For-Each Loop
        // The for-each loop in Java is used to iterate
        // through an array or a collection of elements.
        // The syntax of the for-each loop is:
        // for (element_type element : array/collection) {
        //     // code to be executed
        // }
        System.out.println("Example of for-each loop with an array");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }
        // Output: 1 2 3 4 5
    }
}
