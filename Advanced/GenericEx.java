package Advanced;

class Animal<T extends Number> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

}

public class GenericEx {

    public static void main(String[] args) {

        Animal<Double> names = new Animal<>();
        names.set(23.1);
        System.out.println(names);

        Animal<Integer> code = new Animal<>();
        code.set(45);
    }
}
