package Advanced;

class Calculator<T extends Number> {

    private T first;
    private T sec;

    public Calculator(T first, T sec) {
        this.first = first;
        this.sec = sec;
    }

    public double sum() {
        return first.doubleValue() + sec.doubleValue();
    }
}

public class GenericEx {

    public static void main(String[] args) {
        Calculator<Integer> myCalc = new Calculator(4, 10);
        double newVal = myCalc.sum();
        System.out.println(newVal);
    }
}
