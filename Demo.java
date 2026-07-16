class Car {
    // Data
    private String name;
    int value = 100;

    public int multiplyBy(int x) {

        return x * 100;
    }

    public double addBy(int x) {

        return x + value;
    }

}

public class Demo {

    public static void main(String[] args) {
        Car tesla = new Car();
        int total = tesla.multiplyBy(56);
        System.out.println(total);

    }

}