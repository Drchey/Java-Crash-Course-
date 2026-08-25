package Advanced;

interface Greeting {
    void handshake(String time);
}

public class LamdaEx {

    public static void main(String[] args) {
        Greeting newGreeting = time -> System.out.println("Shaking his hand in the " + time);
        newGreeting.handshake("Morning ");
    }

}
