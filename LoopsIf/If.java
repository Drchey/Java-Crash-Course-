package LoopsIf;

public class If {
    /*
     * If Statment lets us control the flow of program - it dictates if and when the
     * code runs and which doesnt
     * 
     * - For one Statement we dont need {} but other than that wrapped block of code
     * in {}
     */

    public void single() {
        boolean isAdmin = true;

        if (isAdmin)
            System.out.println("Welcome Admin");
    }

    // Most Conditions are used in comparision operators
    public void comparison() {
        int x = 50;

        if (x > 40) {
            System.out.println("Passing Grade");
        }

        // We can have more than one comparison using logical creators

        if (x > 40 && x < 60) {
            System.out.println("Passing Grad but do better");
        }

    }

    // else allows us to run a code if its false

    public void elsevalue() {
        boolean isAdmin = false;

        if (isAdmin)
            System.out.println("Welcome Admin");

        else
            System.out.println("No access !");
    }

    // Use the else if statement to specify a new condition to test if the first
    // condition is false

    public void elseIfValue() {
        int value = 2; //

        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2.");
        } else {
            System.out.println("Value is not 1 or 2.");
        }
    }

    // Tenary - variable = (condition) ? expressionTrue : expressionFalse;

    public void tenaryValue() {
        int time = 20;
        String greeting = (time < 17) ? "Good day." : "Good evening.";
        System.out.println(greeting);

        // We can handle more than 2 expressions
        int time2 = 22;
        String message = (time2 < 12) ? "Good morning."
                : (time2 < 18) ? "Good afternoon."
                        : "Good evening.";
        System.out.println(message);
    }

    // We can place an if within an if (Nested if)

    public void nestedIf() {
        boolean isUser = true;
        boolean isAdmin = true;

        if (isUser) {
            System.out.println("Logged In User");

            if (isAdmin) {
                System.out.println("Has full access");
            } else {
                System.out.println("Does not have access ");
            }
        } else {
            System.out.println("Not a User, Sign Up");
        }
    }
}
