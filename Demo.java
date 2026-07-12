class Car {
    // Data
    private String name;
    private String brand;
    private boolean is_active;
    private int battery_level;

    // Constructors ? - Run at creation

    public Car(String name, String brand, boolean is_active, int battery_level) {
        this.name = name;
        this.brand = brand;
        this.is_active = is_active;
        this.battery_level = battery_level;
    }

    // Methods
    public void drive() {
        System.out.println(name);
    }

    public void setBatteryLevel(int battery_level) {
        if (battery_level > 0 && battery_level < 100) {
            System.out.println("Battery is Good");
        } else {
            System.out.println("Invalid Battery Level");
        }
    }

    public void honk() {
        System.out.println("Honking");
    }

    public void brake() {
        System.out.println("Braking");
    }

    public void dance() {
        System.out.println("Dance !");
    }

}

public class Demo {

    public static void main(String[] args) {
        Car tesla = new Car("tesla", "model S", true, 80); // Objects
        tesla.drive();
        tesla.dance();
        // System.out.println();
    }

}