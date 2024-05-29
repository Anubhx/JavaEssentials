import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Conditional Statements in Java
        // Conditional statements in Java are used to perform different actions based on different conditions.
        // Java supports the following conditional statements:
        // 1. If Statement
        // 2. If-Else Statement
        // 3. If-Else-If Statement
        // 4. Switch Statement
        // 5. Ternary Operator

        // If Statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } // Output: You are eligible to vote

        // If-Else Statement
        boolean day = true;
        if (day) {
            System.out.println("It's a good day");
        } else {
            System.out.println("It's a bad day");
        }
        // Output: It's a good day

        // If-Else-If Statement
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
        // Output: Enter your marks: 85
        // A Grade
        // Note: In the above example, the user is asked to enter their marks,
        // and based on the marks, the program displays the corresponding grade using the if-else-if ladder.

        // Switch Statement
        // The switch statement in Java is used to execute one statement from multiple conditions.
        
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
        // The switch statement works with byte, short, int, long, enum types, String, and some wrapper types like Byte, Short, Int, and Long.
        
        sc.close(); // Close the Scanner object
    }
}
