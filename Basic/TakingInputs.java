import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        //Taking Inputs in Java
        //To take inputs in Java, you can use the Scanner class
        //You need to import the java.util.Scanner package to use the Scanner class
        //Syntax: Scanner scanner = new Scanner(System.in);
        //To take an integer input, you can use the nextInt() method
        //To take a double input, you can use the nextDouble() method
        //To take a string input, you can use the next() method
        //To take a character input, you can use the next().charAt(0) method
        //To close the scanner object, you can use the close() method
        //Example:
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your: weight: ");
        double weight = scanner.nextDouble();

        scanner.close();
    }
}
