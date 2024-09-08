public class LargeIntMultiplication {
    public static void main(String[] args) {
        // Declare two large int values
        int num1 = 2000000000;
        int num2 = 2;

        // Multiply two large int values and store in an int
        int intResult = num1 * num2;

        // Cast the result to a long after multiplication
        long longResult = (long) intResult;

        // Print the int result and the long result
        System.out.println("Result of multiplication stored in int: " + intResult);
        System.out.println("Result after casting to long: " + longResult);
    }
}
