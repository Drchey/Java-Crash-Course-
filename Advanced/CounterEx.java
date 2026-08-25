package Advanced;

// class MyThread extends Thread {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i + " executed by " + Thread.currentThread().getName());
//         }
//     }

// }

class Counter {

    private int count = 0;

    public synchronized void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class CounterEx {
    public static void main(String[] args) throws Exception {
        Counter c1 = new Counter();

        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                c1.add();
                System.out.println(c1);
            }
        });

        Thread secondThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.add();
                // Thread.MAX_PRIORITY
                System.out.println(c1);
            }
        });

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println("Final Count " + c1.getCount());
    }
}
