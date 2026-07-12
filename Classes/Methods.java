package Classes;

public class Methods {

    /**
     * Methods are the behaviours of our code.
     * They are blocks of code that are used to perform certain actions
     * They are only written within our classes
     * 
     * - A method are basically functions but within the classes.
     * 
     * 
     */
    private boolean isSet;

    public Methods(boolean isSet) {
        this.isSet = isSet;
    }

    public static void testMethod() {

        /**
         * - testMethod() - name of the method
         * - void - the return value (They can be String, Int, Boolean, long etc..)
         * - static - belongs to the class and not an object. meaning that it is loaded
         * into classes without creating an object
         * - () - Parenthesis act as placeholders for what data the methods expects
         * (arguments)
         * 
         */
        System.out.println("Method");
    }

    public void testMethodWithParams(boolean isSet) { // Parenthesis - with single arg
        isSet = !isSet;
        System.out.println("Is Set is : " + isSet);
    }

    // Return Values
    /**
     * This is the expected return response type from a method
     * - void: dont return anything
     * - int : return type int
     * - booolean : return type boolean
     * - String: return type String
     * (There are further examples with all the types both primitive and
     * non-primitive)
     */

    public boolean valueOfSet(boolean isSet) {
        return isSet; // return is the keyword
    }

    /**
     * Method Overloading
     * 
     * - We can create methods within a class with the same name (for example if the
     * both do the same thing) like if they both add double and int values
     */

    public String valueOfSet(String isSet) {
        // Simplified Example
        if (isSet == "true") {
            return "Message of True";
        }
        return "Message";
    }

    // Scope: We can declare vars within a method. those variables are avaliable
    // with that method only

    public void enterVars() {
        int x = 34;
    }

    public int checkVarsData() {
        // Uncomment - return x;
        // X can be resolved here
        return 0; // comment this
    }

}
