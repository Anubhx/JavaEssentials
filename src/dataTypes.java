public class dataTypes {
    public static void main(String[] args) {
        // byte: 8-bit integer. Range: -128 to 127. Space: 1 byte.
        byte age = 30;

        // int: 32-bit integer. Range: -2^31 to 2^31-1. Space: 4 bytes.
        int phoneNum = 1234567890;  // Only have 10 digits of number

        // double: 64-bit floating-point number. Space: 8 bytes.
        double nums = 3.123;  // Stores decimal numbers

        // long: 64-bit integer. Range: -2^63 to 2^63-1. Space: 8 bytes.
        long num = 12345678990L;  // Must add 'L' at the end to denote a long number

        // float: 32-bit floating-point number. Space: 4 bytes.
        float pi = 3.14F;  // Must add 'F' at the end to denote a float number

        // char: 16-bit Unicode character. Space: 2 bytes.
        char letter = '@';

        // boolean: Represents one bit of information but its "size" isn't precisely defined.
        // Typically, it uses 1 byte in practice.
        boolean adult = true;
    }
}
