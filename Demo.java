
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " executed by " + Thread.currentThread().getName());
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        Thread newThread = new Thread();
        newThread.start();
    }
}
