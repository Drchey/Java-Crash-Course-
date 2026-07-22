package Classes;

// Abstract class (cannot be instantiated directly)
// Used to DEFINE a blueprint for other classes
abstract class Car {

    // Abstract method (no body)
    // Forces child classes to provide implementation
    public abstract void speed();

    // Concrete method (has implementation)
    // Can be inherited directly by child classes
    public void drive() {
        System.out.println("Driving");
    }
}

// Child class that extends the abstract class
class Honda extends Car {

    // MUST implement the abstract method from Car
    // This is how abstraction works: details are defined in child class

    // @Override - Indicates that a method declaration is intended to override a
    // method declaration in a supertype. If a method is annotated with this
    // annotation type compilers are required to generate an error message unless at
    // least one of the following conditions hold:
    public void speed() {
        System.out.println("Speed @ 100Km/hr");
    }
}

public class Abstraction {

    /**
     * Abstraction:
     * - Hides implementation details
     * - Shows only essential features
     * - Achieved using abstract classes or interfaces
     */

    public static void main(String[] args) {

        // Cannot do this:
        // Car car = new Car(); ❌ (abstract classes cannot be instantiated)

        // Using child class object
        Honda myObj = new Honda();

        // Calls the implemented method in Honda
        myObj.speed();

        // Calls the inherited concrete method from Car
        myObj.drive();

        // BETTER practice (polymorphism + abstraction combined)
        Car car = new Honda();

        // Even though reference is Car,
        // the actual implementation comes from Honda
        car.speed(); // Runtime decision

        // Inherited method still works
        car.drive();
    }
}