// Unit 7: Threads using Runnable Interface
// Concept: Create threads by implementing Runnable interface

// Runnable implementation
class Worker implements Runnable {

    String workerName;

    // Constructor
    public Worker(String name) {
        workerName = name;
    }

    // run() method - executes in thread
    @Override
    public void run() {
        System.out.println(workerName + " started working");

        for (int i = 1; i <= 3; i++) {
            System.out.println(workerName + " is working... " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Work interrupted");
            }
        }

        System.out.println(workerName + " finished");
    }
}

// Main class to test Runnable
public class ThreadRunnable {

    public static void main(String[] args) {

        System.out.println(" THREADS WITH RUNNABLE \n");

        // Create Runnable objects
        Worker worker1 = new Worker("Worker-A");
        Worker worker2 = new Worker("Worker-B");

        // Create Thread objects passing Runnable
        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);

        // Start threads
        System.out.println("Starting workers...");
        t1.start();
        t2.start();

}
