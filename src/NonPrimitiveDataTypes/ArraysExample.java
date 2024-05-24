package NonPrimitiveDataTypes;

import java.util.Arrays;  // Importing the correct Arrays class

public class ArraysExample {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {90, 85, 88, 92, 78};  // Declaring and initializing an array of integers

        int[] marks = new int[6];  // Declaring an array of integers with size 6

        // Assigning values to the array elements
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 88;
        marks[3] = 92;
        marks[4] = 78;
        // marks[5] = 100;  // Uncommenting this will assign the value 100 to the 6th element

        // Printing the array reference, not the contents
        System.out.println(marks);  // Output: [I@15db9742   // This is the hash code of the array object

        // Properly printing the array contents
        System.out.println("Marks array: " + Arrays.toString(marks));  // Output: Marks array: [90, 85, 88, 92, 78, 0]

        // Accessing the first element of the array
        System.out.println("First element: " + marks[0]);  // Output: 90

        // Accessing all elements of the array using a loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + ": " + marks[i]);
        }
        // Output:
        // Element at index 0: 90
        // Element at index 1: 85
        // Element at index 2: 88
        // Element at index 3: 92
        // Element at index 4: 78
        // Element at index 5: 0

        // Length of an Array
        // The length property of an array in Java returns the number of elements in the array.
        System.out.println("Length of the numbers array: " + numbers.length);  // Output: 5

        // Sorting an Array
        // The Arrays class in Java provides a sort() method to sort an array in ascending order.
        Arrays.sort(marks);  // Sorting the marks array
        System.out.println("Sorted marks array: " + Arrays.toString(marks));  // Output: Sorted marks array: [0, 78, 85, 88, 90, 92]
    }
}
// / Java is you don't have to specify the size of the array when initializing it with values. 
// The size is automatically determined based on the number of elements provided.

// In the above example, the array numbers is initialized with 5 elements, so the size of the array is automatically set to 5.

// The array marks is declared with a size of 5 using new int[5], and then the values are assigned to each element individually.

// In java if you don't assign a value to an element in the array, it will be initialized with a default value based on the data type. 
// For integers, the default value is 0.