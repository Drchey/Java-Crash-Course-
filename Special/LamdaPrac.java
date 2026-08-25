package Special;

interface Greeting {
    void greet(String name);
}

public class LamdaPrac {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {

            public void greet(String name) {
                System.out.println(name);
            }
        };
    }
}