package OOPS.threads_Inheritance;

class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Running");
        try {
            Thread.sleep(1000); // moves to waiting temporarily
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Finished execution");
    }
}

public class ThreadLifeCycleExample {
    public static void main(String[] args) {
        LifeCycleDemo t1 = new LifeCycleDemo(); // New state
        System.out.println("State after creation: " + t1.getState());

        t1.start(); // Runnable state
        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(500); // main thread waits
            System.out.println("State while running: " + t1.getState());
            t1.join(); // wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after termination: " + t1.getState());
    }
}
