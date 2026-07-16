package Classes;

class Car {
    public void drive() {
        System.out.println("Driving at 60KM/H");
    }
}

class Honda extends Car {
    public void drive() {
        System.out.println("Driving at 100KM/H");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Honda newCar = new Honda();

        newCar.drive();
    }
}
