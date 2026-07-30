package Classes;

/**
 * Interface:
 * - A contract that defines what a class MUST do
 * - Contains method declarations (no body by default)
 * - Used to achieve full abstraction
 * - A class IMPLEMENTS an interface
 */

interface Car {

    // Methods in an interface are PUBLIC and ABSTRACT by default
    // No method body (until Java 8 default methods)
    void drive();

    void honk();
}

// Class implementing the interface
class Honda implements Car {

    // MUST implement ALL methods from the interface
    // @Override - Annotations
    public void drive() {
        System.out.println("Driving");
    }

    // @Override - Annotations
    public void honk() {
        System.out.println("Honking");
    }

    // Extra method specific to Honda (not part of interface)
    public void brake() {
        System.out.println("Braking");
    }
}

public class Interfaces {
    // public static void main(String[] args) {

    // // Creating object of Honda
    // Honda myObj = new Honda();

    // // Calling implemented methods
    // myObj.drive();
    // myObj.honk();

    // // Calling Honda-specific method
    // myObj.brake();

    // // BEST PRACTICE: Use interface reference (loose coupling)
    // Car car = new Honda();

    // // Allowed: methods defined in interface
    // car.drive();
    // car.honk();

    // // Not allowed:
    // // car.brake();

    // /**
    // * Key idea:
    // * - Interface defines WHAT to do
    // * - Class defines HOW to do it
    // */
    // }
}