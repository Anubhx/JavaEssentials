package NonPrimitiveDataTypes;

import java.util.Arrays;

public class TwoDArraysExample {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array of integers
        int[][] marks = {
            {90, 85, 88, 92, 78}, // First row
            {92, 88, 78, 85, 90}  // Second row
        };

        // Accessing and printing a specific element in the 2D array
        System.out.println("Element at marks[1][0]: " + marks[1][0]);  // Output: 92

        // Printing each row of the 2D array
        System.out.println("First row: " + Arrays.toString(marks[0]));  // Output: [90, 85, 88, 92, 78]
        System.out.println("Second row: " + Arrays.toString(marks[1])); // Output: [92, 88, 78, 85, 90]

        // Printing the entire 2D array using nested loops
        System.out.println("Full marks array:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
        
        // Printing the entire 2D array using Arrays.deepToString() method
        System.out.println("Full marks array using Arrays.deepToString(): " + Arrays.deepToString(marks));
    }
}

/*
Tips for Working with 2D Arrays in Java:

1. Declaration:
   - You can declare a 2D array with the syntax: int[][] arrayName = new int[rows][columns];
   - Alternatively, you can initialize it directly as shown in the example: int[][] arrayName = { {row1}, {row2}, ... };

2. Accessing Elements:
   - Access elements using arrayName[rowIndex][colIndex], where indices start from 0.
   - Be cautious of ArrayIndexOutOfBoundsException by ensuring your indices are within the valid range.

3. Iterating Through 2D Arrays:
   - Use nested loops to iterate through each element.
   - The outer loop iterates over the rows, and the inner loop iterates over the columns.

4. Printing 2D Arrays:
   - Use Arrays.toString(arrayName[row]) to print a specific row.
   - Use Arrays.deepToString(arrayName) to print the entire 2D array in a readable format.

5. Common Operations:
   - Transposing, rotating, and summing elements in rows or columns are common operations that might require nested loops.
   - Ensure proper initialization, especially when dynamically setting the size based on conditions or user input.

6. Memory Considerations:
   - 2D arrays in Java are arrays of arrays, meaning each "row" is actually a reference to another array.
   - This structure allows for "jagged" arrays where rows can have different lengths, although this is less common.

7. Initialization:
   - If not explicitly initialized, 2D arrays of primitive types will be filled with their default values (e.g., 0 for int).
    - For reference types (e.g., String), uninitialized elements will be null.
*/
