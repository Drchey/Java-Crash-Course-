package Errors;

/**
 * Every Dev would have to deal with bugs. At Begineer level and the most
 * advanced level.
 * What makes us better devs as we move along is identifying these bugs and
 * fixing it
 * 
 * 
 */

public class ErrorType {

    public static void main(String[] args) {
        /**
         * WHAT ARE THEY TYPES OF ERRORS WE HAVE
         * 1. Compile Time Error
         * - These are Errors instantly tracked by our compiler, and prevents the code
         * from running
         */

        // Uncomment Code Below (Syntax Error)
        // int x = 23
        // Uncomment Code Below (Undefined variable)
        // newVar = 34;
        // Uncomment Code Below (Types)
        // String newName = 34;

        /**
         * 1. Run Time Error
         * - These are Errors that run the program but crashes unexpectedly
         * 
         * The compiler doesnt flag syntax errors but it may be due to uncaught
         * exceptions, null pointer, I/0 , or even Out of Bound exception
         */

        // Uncomment Code Below - t
        // int x = 10;
        // int y = 0;

        // System.out.println(x / y);

        /**
         * Logical Errors: these are unlike compile or run time errors
         * the code doesnt crash in this instance but they dont run exactly as expected
         */

        // Uncomment
        // int x = 2;
        // int y = 2;
        // int result = x * y;
        // System.out.println(result); // Code runs 4(as expected) , but change x = 3 or
        // anything u get an unexpected
        // // result

        /**
         * Errors are unavoidable but we can make it easier to detect but applying best
         * practices such as naming conventions related to what we are building, and
         * reading
         * the error logs, using breakpoints to pause the programs at different stages
         * of flow,
         * read code !!!!
         */
    }
}
