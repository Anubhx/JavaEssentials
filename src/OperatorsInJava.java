public class OperatorsInJava {
    public static void main(String[] args) {
        //Operators in Java are special symbols that perform specific operations on one, two, or three operands and then return a result.
        //Types of Operators in Java - Arithmetic, Relational, Logical, Bitwise, Assignment, Conditional, and Unary


        
        //Arithmetic Operators - Addition, Subtraction, Multiplication, Division, Modulus, Increment, and Decrement
        int num1 = 100;
        int num2 = 50;
        int sum = num1 + num2; //Addition
        int diff = num1 - num2; //Subtraction
        int product = num1 * num2; //Multiplication
        int div = num1 / num2; //Division
        int mod = num1 % num2; //Modulus   //Note: Modulus operator (%) returns the remainder of the division operation
        num1++; //Increment
        num2--; //Decrement
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("Increment: " + num1);
        System.out.println("Decrement: " + num2);
        //Output: Sum: 150
        //Difference: 50
        //Product: 5000
        //Division: 2
        //Modulus: 0
        //Increment: 101
        //Decrement: 49

        // Relational Operators - Greater than, Less than, Greater than or equal to, Less than or equal to, Equal to, and Not equal to
        int num3 = 100;
        int num4 = 50;
        System.out.println(num3 > num4); //Greater than
        System.out.println(num3 < num4); //Less than
        System.out.println(num3 >= num4); //Greater than or equal to
        System.out.println(num3 <= num4); //Less than or equal to
        System.out.println(num3 == num4); //Equal to
        System.out.println(num3 != num4); //Not equal to
       
        //Logical Operators - AND, OR, and NOT
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); //AND 
        System.out.println(a || b); //OR
        System.out.println(!a); //NOT
        
        //Bitwise Operators - AND, OR, XOR, NOT, Left shift, and Right shift
        int num5 = 5; //Binary: 101
        int num6 = 3; //Binary: 011
        System.out.println(num5 & num6); //AND
        System.out.println(num5 | num6); //OR
        System.out.println(num5 ^ num6); //XOR
        System.out.println(~num5); //NOT
        System.out.println(num5 << 1); //Left shift
        System.out.println(num5 >> 1); //Right shift

        //Assignment Operators - Assigns a value to a variable
        int num7 = 10;
        num7 += 5; //Equivalent to num7 = num7 + 5
        System.out.println(num7); //Output: 15
        final int num8 = 10; //Final variable
        //num8 += 5; //Error: Cannot assign a value to a final variable
        //Note: Final variables cannot be reassigned a value once initialized

        //Conditional Operator (Ternary Operator) - Evaluates a boolean expression and returns one of the two values based on the result
        int num9 = 10;
        int num10 = 20;
        int result = (num9 > num10) ? num9 : num10;
        System.out.println("Result: " + result); //Output: 20
        //Note: If the condition is true, the first value is returned; otherwise, the second value is returned

        //Unary Operators - Increment, Decrement, Positive, Negative
        int num11 = 10;
        int num12 = -10;
        System.out.println(num11++); //Post-increment
        System.out.println(num11); //Output: 11
        System.out.println(++num11); //Pre-increment
        System.out.println(num11); //Output: 12
        System.out.println(num12--); //Post-decrement
        System.out.println(num12); //Output: -11
        System.out.println(--num12); //Pre-decrement
        System.out.println(num12); //Output: -12
        System.out.println(+num11); //Positive
        System.out.println(-num11); //Negative

        //Instanceof Operator - Checks if an object is an instance of a particular class
        String str = "Hello";
        System.out.println(str instanceof String); //Output: true
        //Note: instanceof operator returns true if the object is an instance of the specified class; otherwise, it returns false
        //Note: instanceof operator is used to test if an object is an instance of a class or an interface

        //Operator Precedence - Order in which operators are evaluated in an expression
        int num13 = 10;
        int num14 = 20;
        int num15 = 30;
        int result1 = num13 + num14 * num15;
        System.out.println("Result1: " + result1); //Output: 610
        //Note: Multiplication (*) has higher precedence than addition (+)
        //Note: Parentheses () can be used to change the order of evaluation
        //Note: Operators with higher precedence are evaluated first
        //Note: If two operators have the same precedence, they are evaluated from left to right
        //Note: Operator precedence can be remembered using the acronym 
        //PEMDAS (Parentheses, Exponents, Multiplication and Division, Addition and Subtraction)
        
            

        


        
    }
}
