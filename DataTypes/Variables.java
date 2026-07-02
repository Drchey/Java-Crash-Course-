package DataTypes;

public class Variables {
    /*
     * - 01 Variables are used to Store values
     * 
     * String - text values
     * int - integer values
     * float - decimal values or floating point values
     * double - decimal values
     * char - single character
     * boolean - true or false state values
     */

    // Syntax to create values
    String name = "Jude"; // Must use double quotes
    int age = 28;
    float cost = 455.2f; // end decimal with f
    char letter = 't'; // Single char, single quotes
    boolean isAdmin = true;

    /**
     * var keyword was introduced in latest JAVA which lets the compiler
     * automatically detect the type of a var
     */

    // var newValue = 5; - var is not allowed here

    /*
     * -- 02 Declare Many Variables
     * To declare more than one variable of the same type, you can use a
     * comma-separated list
     */
    int x = 5, y = 6, z = 50;

    public static void main(StringAbout[] args) {

        var newValue = 5; // var is allowed here
        /*
         * -- 03 One Value to Multiple Variables
         * 
         */
        int a, b, c;
        a = b = c = 60;

        /* -- 04 Assigning new values to variables */

        int myNum = 56;
        myNum = 32;

        System.out.println(myNum);

        // Final prevents overwriting existing values.
        // Use final to declare values that should never change
        final int finalNum = 56;
        // finalNum = 32;
        Math.min(myNum, 2);
        System.out.println(finalNum);

        /*
         * Pointers
         * - All Java variables must be identified with unique names.
         * -Identifiers can be short names (like x and y) or more descriptive names
         * (age, sum, totalVolume) but its recommended to use more descriptive names in
         * order to create maintainable code
         * - Names can contain letters, digits, underscores, and dollar signs
         * - Names must begin with a letter
         * - Names should start with a lowercase letter, and cannot contain whitespace
         * - Names can also begin with $ and _
         * - Names are case-sensitive
         */

    }
}
