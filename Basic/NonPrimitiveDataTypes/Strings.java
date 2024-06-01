package NonPrimitiveDataTypes;

public class Strings {
    public static void main(String[] args) {
        // Declaring and initializing a string variable
        String name = "Anubhav";  // String is a class in Java
        System.out.println("Name: " + name);

        // String concatenation - Adding two strings together
        String firstName = "Anubhav";  // First name
        String lastName = "Raj";  // Last name
        
        // Using concatenation operator (+) to concatenate strings
        String fullName = firstName + " " + lastName;  // Concatenating first name and last name with a space
        System.out.println("Full Name: " + fullName);
        
        // Using the concat() method to concatenate strings
        String fullName2 = firstName.concat(" ").concat(lastName);  // Concatenating first name and last name
        System.out.println("Full Name (using concat): " + fullName2);

        // charAt() method - Returns the character at the specified index
        System.out.println("First character of the name: " + name.charAt(0));  // Prints the first character of the name 
        // Index in Java starts from 0, so 0th index is the first character

        // length() method - Returns the length of the string
        System.out.println("Length of the name: " + name.length());  // Prints the length of the name

        // replace() method - Replaces each occurrence of a character with another character
        String newString = name.replace('A', 'B');  // Replace occurrence of 'A' with 'B'
        System.out.println("New String: " + newString);
        // Output: New String: Bnubhav
        // In Java, strings are immutable, so the original string is not changed

        // substring() method - Extracts a substring from the string
        String subString = name.substring(1, 5); // Extracts substring from index 1 to 5 (exclusive)
        System.out.println("Substring: " + subString);
        // Output: Substring: nubh
    }
}

/* Tips for Strings in Java:
1. Strings are immutable: Once a string is created, it cannot be changed. Any modification will result in a new string being created.
2. Use StringBuilder or StringBuffer for mutable strings: If you need to modify a string frequently, consider using StringBuilder or StringBuffer for better performance.
3. String Pool: Java maintains a pool of strings to optimize memory usage. When you create a string literal, Java checks the pool first. If the string exists, it returns the reference; otherwise, it adds the new string to the pool.
4. Avoid using `==` to compare strings: Use the `.equals()` method to compare the content of two strings rather than the `==` operator, which compares references.
5. Be aware of case sensitivity: Use methods like `.equalsIgnoreCase()` when you need to perform case-insensitive comparisons.
6. Use `.trim()` to remove whitespace: The `.trim()` method removes leading and trailing whitespace, which can be useful for processing user input.
7. Efficient concatenation: For multiple string concatenations in loops, use `StringBuilder` or `StringBuffer` to avoid creating many temporary string objects.
*/
