public class CastingsInJava {
    public static void main(String[] args) {
        //Casting in java is a process of converting one data type into another data type.
        double price = 100.50;
        double finalprice = price + 18; //Implicit casting - converting int to double
        System.out.println("Final Price: " + finalprice);

        //Types of casting - Widening (Implicit) and Narrowing (Explicit)
        //Widening (Implicit) Casting - When you convert a smaller data type to a larger data type
        int num2 = 100;
        double num3 = num2; //Implicit casting - converting int to double
        System.out.println("Double value: " + num3);
        //Output: Double value: 100.0
        //Note: Widening casting does not lead to loss of data as int to double conversion does not lead to loss of data


        //Narrowing (Explicit) Casting - When you convert a larger data type to a smaller data type 
        double price1 = 100.50;
        int finalprice1 = (int) price1 + 18; //Explicit casting - converting double to int
        System.out.println("Final Price: " + finalprice1);
         //Note: Narrowing casting may lead to loss of data as double to int conversion may lead to loss of decimal points

         //int to string conversion
            int num = 100;
            String str = Integer.toString(num) + 10;
            System.out.println("String value: " + str);
            //Output: String value: 10010
            //Note: If you want to convert int to string, you can use Integer.toString() method
        
        //String to int conversion
            String str1 = "100";
            int num1 = Integer.parseInt(str1) + 10;
            System.out.println("Int value: " + num1);
            //Output: Int value: 110
            //Note: If the string is not a valid number, then it will throw NumberFormatException

            

    }
}
