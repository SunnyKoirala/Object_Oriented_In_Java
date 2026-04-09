package OOPS.threads_interface;
class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running"); // Running state
        try {
            Thread.sleep(500); // Thread sleeps (Timed Waiting)
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted");
        }
        System.out.println(name + " finished"); // Terminated state
    }
}

public class SimpleRunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Thread-1")); // New state
        Thread t2 = new Thread(new MyTask("Thread-2")); // New state

        t1.start(); // Runnable → Running
        t2.start();

        System.out.println("Main thread is running");

        try {
            t1.join(); // Main thread waits for t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
