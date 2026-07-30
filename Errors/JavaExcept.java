package Errors;

public class JavaExcept {

    /**
     * Exception Handling in Java
     *
     * When an error occurs, Java throws an exception.
     * As developers, we can also manually throw exceptions using the "throw"
     * keyword.
     *
     * "throw" allows us to create custom error messages.
     *
     * Common Errors/Exceptions:
     *
     * - ArithmeticException: Occurs when a numeric calculation fails (e.g., divide
     * by zero)
     * - ArrayIndexOutOfBoundsException: Accessing an invalid array index
     * - ClassFormatError: Class file cannot be accessed properly
     * - ClassNotFoundException: Class cannot be found
     * - ConcurrentModificationException: Modifying a collection while iterating
     * - FileNotFoundException: File cannot be located
     * - IncompatibleClassChangeError: Class structure changed after compilation
     * - InputMismatchException: Invalid input type (e.g., text instead of number)
     * - InterruptedException: Thread interrupted during execution
     * - InvalidClassException: Serialization issue with a class
     * - IOException: General input/output failure
     * - NegativeArraySizeException: Creating array with negative size
     * - NoClassDefFoundError: Class not found at runtime
     * - NoSuchFieldException: Field does not exist
     * - NoSuchMethodException: Method does not exist
     * - NullPointerException: Accessing a null object reference
     * - NumberFormatException: Invalid string-to-number conversion
     * - RuntimeException: General runtime exception
     * - StringIndexOutOfBoundsException: Invalid string index
     * - TypeNotPresentException: Type cannot be found
     * - IllegalArgumentException: Invalid argument passed to a method
     * - IllegalStateException: Method called at the wrong time/state
     */

    // Basic try-catch-finally example
    public static void basicHandling() {
        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y); // Causes ArithmeticException
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Code execution completed.");
        }
    }

    // Using "throw" to manually raise an exception
    public static void throwExample() {
        int time = 10;

        if (time > 18) {
            throw new ArithmeticException("Office closed for the day.");
        } else {
            System.out.println("Access granted!");
        }
    }

    // Handling multiple exceptions
    public static void multipleExceptions() {

        // Separate catch blocks (ordered from specific → general)
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException (won’t run)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Something else went wrong.");
        }

        // Multiple exceptions in one catch block (Java 7+)
        try {
            int result = 10 / 0;
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math error or array error occurred.");
        }
    }

    public static void main(String[] args) {
        basicHandling();
        throwExample();
        multipleExceptions();
    }

}
