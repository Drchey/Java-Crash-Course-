/**
 * Abstraction
 */

interface Greeting {
    public abstract void sayHello();

    public abstract void eat();
}

class Morning implements Greeting {
    public void sayHello() {
        System.out.println("Good Morning");
    }

    public void eat() {
        System.out.println("Breakfast");
    }
}

class Afternoon implements Greeting {
    public void sayHello() {
        System.out.println("Good Afternoon");
    }

    public void eat() {
        System.out.println("Lunch");
    }
}

class Evening implements Greeting {
    public void sayHello() {
        System.out.println("Good Evening");
    }

    public void eat() {
        System.out.println("Dinner");
    }
}