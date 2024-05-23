package NonPrimitiveDataTypes;

public class Strings {
    public static void main(String[] args) {
        String name = "Anubhav";  // String is a class in Java
        System.out.println("Name: " + name);

        // String concatenation Adding two strings together
        String firstName = "Anubhav";  // First name
        String lastName = "Raj";  // Last name
        
        // Using concatenation operator (+) to concatenate strings
        String fullName = firstName + " " + lastName;  // Concatenating first name and last name with a space
        
        // Using the concat() method to concatenate strings
        String fullName2 = firstName.concat(" ").concat(lastName);  // Concatenating first name and last name
        
        System.out.println("Full Name: " + fullName);  
        System.out.println("Full Name : " + fullName2); 

        //charAt() method
        System.out.println("First character of the name: " + name.charAt(0));  // Prints the first character of the name 
        // index in java starts from 0 so 0th index is the first character
        
        //length() method
        System.out.println("Length of the name: " + name.length());  // Prints the length of the name

        //replace() method
        String newString = name.replace('A', 'B');  // Replace  first occurrence of 'A' with 'B'
        System.out.println("New String: " + newString);
        
    }
}
