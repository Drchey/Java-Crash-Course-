class Clarkson { // Parent Cass
    private String name;
    private int age;

    public void drive() {
        System.out.println("Driving");
    }

    private void walk() {
        System.out.println("Walking");
    }
}

class May extends Clarkson {
    public void talk() {
        System.out.println("Talking.. ");
    }
}

// Inherinting from Clarkson
class Hamm extends May {
    public void run() {
        System.out.println("Running");
    }
}

public class Employee {

    // public static void main(String[] args) {
    // Hamm obj = new Hamm();
    // obj.drive();
    // // obj.walk();
    // }
}