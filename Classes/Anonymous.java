package Classes;

// Regular class
class Car {
    public void drive() {
        System.out.println("Driving");
    }
}

public class Anonymous {
    public static void main(String[] args) {

        // Creating an ANONYMOUS CLASS
        // - No class name
        // - Used only once (inline)
        // - Extends Car and overrides its method immediately
        Car myObj = new Car() {

            // Overriding the drive() method
            // This is similar to creating a separate subclass,
            // but done inline without naming the class
            // @Override
            public void drive() {
                System.out.println("Driving Slowly");
            }
        };

        // Calling the overridden method
        // This will use the anonymous class version, not the original Car method
        myObj.drive();
    }
}