package Advanced;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " executed by " + Thread.currentThread().getName());
        }
    }

}

public class ThreadsEx {

    /**
     * Multi Threading is a core concept in Java that allows multiple tasks to run
     * concurrently.
     * - Its great for efficent CPU utilization
     * - Enhanced performance
     * - Its facilitated by the Thread class extending the thread and implementing
     * runnable
     * - The more common approach is to implement the Runnable interface.
     * 
     * A thread in Java goes through the following states during its lifecycle:
     * 
     * 
     * Thread Lifecycle
     * 
     * New: The thread is created but not yet started.
     * Runnable: The thread is ready to run and waiting for CPU allocation.
     * Running: The thread is executing.
     * Blocked/Waiting: The thread is alive but waiting for resources or a lock.
     * Terminated: The thread has finished execution or has been terminated.
     * 
     * 
     * When multiple threads access shared resources, there is a risk of thread
     * interference. To avoid this, synchronization is used to allow only one thread
     * to access a resource at a time.
     * 
     * 
     * 
     */

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();
    }

}