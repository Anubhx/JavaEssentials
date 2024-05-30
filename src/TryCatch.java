import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // Try Catch in java is used to handle exceptions
        // It is used to handle the runtime errors that occur during the execution of the program
        // It is used to prevent the program from crashing
        
        // Try Catch block to handle ArrayIndexOutOfBoundsException 
        // when user enters an index that is out of bounds
        
        int [] makrs = {65,52, 80};
        Scanner sc = new Scanner(System.in);
         int i = sc.nextInt();
         
        try {
            System.out.println(makrs[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
