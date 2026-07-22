package Classes;

// Parent class (also called Superclass)
class Car {

    // This method defines a general behavior for all cars
    public void drive() {
        System.out.println("Driving at 60KM/H");
    }
}

// Child class (Subclass) that extends Car
class Honda extends Car {

    // This method OVERRIDES the parent class method
    // Same method name, same return type, same parameters
    // This is an example of RUNTIME POLYMORPHISM
    @Override
    public void drive() {
        System.out.println("Driving at 100KM/H");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Creating an object of Honda
        Honda newCar = new Honda();

        // Even though drive() exists in Car,
        // the overridden version in Honda is executed
        // This is polymorphism: same method, different behavior
        newCar.drive();

        // BETTER example of polymorphism (recommended way):
        // Using parent reference to hold child object
        Car car = new Honda();

        // At runtime, Java decides which method to call
        // This will still call Honda's version, not Car's
        car.drive(); // Runtime Polymorphism (Dynamic Method Dispatch)
    }
}