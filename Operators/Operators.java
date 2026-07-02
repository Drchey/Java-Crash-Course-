package Operators;

public class Operators {
    /* Operators are used to perform operations on variables and values */

    // 01 - Arithmetic Operators (used to perform mathematical operations )

    int sum = 100 + 50; // Sum of Numbers
    int sub = 100 - 50; // Subtracts two numbers
    int multiply = 100 * 50; // multiply two numbers
    int division = 100 / 50; // Division of numbers
    int modul = 100 % 50; // returns remainder of division

    public void increment_decrement() {
        // Increment and Decrement

        int score = 55;
        score++; // increment score by 1
        System.out.println(score);
        score--; // decrement score by 1
        System.out.println(score);
    }

    public void assignment() {
        /* Assignment operators are used to assign values to variables. */
        int x = 10; // (=) to assign the value 10
        x += 5; // (+=) adds a value to a variable
        x -= 2; // (-=) substract value from variable
        x *= 3; // (*=) multiply value to variable
        x /= 3; // (-=) divide value from variable
        x %= 3; // (%=) remainder division

    }

    public void comparison() {
        // Comparison operators are used to compare two values (or variables). The
        // return value of a comparison is either true or false.
        int x = 100;
        int y = 79;
        if (x == y)
            ; // == Equal to
        if (x != y)
            ; // != Not equal
        if (x > y)
            ; // Greater than
        if (x < y)
            ; // Less than
        if (x >= y)
            ; // Greater than or equal to
        if (x <= y)
            ; // Less than or equal to
    }

    public void logical() {
        /*
         * check the logic between variables or values, by combining multiple conditions
         */

        // && - if both statements are true returns true
        // || - if one of the statements is true returns true
        // ! - reverse the result

        boolean hasAccess = true;
        boolean isUser = false;

        System.out.println("Regular user: " + (hasAccess && !isUser));
        System.out.println("Has access: " + (hasAccess || isUser));
        System.out.println("Not logged in: " + (!hasAccess));
    }

}
