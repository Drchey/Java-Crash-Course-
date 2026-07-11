package Classes;

// This is a class named Car
// A class is like a blueprint used to create objects (real-world things)
public class Car {

    // These are instance variables (properties of the car)

    // 'private' means they can only be accessed within this class : If variables
    // are public, anyone can change them to anything — even invalid values.

    private String name; // Name of the car (e.g., Model S)
    private String brand; // Brand of the car (e.g., Tesla)
    private boolean is_active; // Indicates if the car is on or off (true = on, false = off)
    private char serial_prefix; // A single character used as part of a serial number
    private double version; // Version of the car model (e.g., 1.0, 2.5)
    private int battery_level; // Battery level percentage (e.g., 80%)

    /*
     * Default Constructor- This is called when you create a Car without passing
     * values
     */
    public Car() {
        System.out.println("Car object created with default constructor");
    }

    /*
     * Parameterized Constructor- This Allows us to set values when creating the
     * object
     */
    public Car(String name, String brand, boolean is_active, char serial_prefix, double version, int battery_level) {
        this.name = name; // 'this' refers to current object
        this.brand = brand;
        this.is_active = is_active;
        this.serial_prefix = serial_prefix;
        this.version = version;
        this.battery_level = battery_level;
    }

    // This method simulates driving the car
    // Methods define what actions the object can perform
    public void drive() {
        System.out.println("Driving"); // Prints message to console
    }

    // This method simulates the car honking
    public void honk() {
        System.out.println("Honk Honk"); // Prints honking sound
    }

    // This method turns on the flashlight (likely meant to be headlights)
    public void turnFlashligt() {
        System.out.println("FlashLight on "); // Prints flashlight status
    }

    // This method simulates braking the car
    public void brakes() {
        System.out.println("Brake Car"); // Prints braking action
    }

}
