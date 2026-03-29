// Unit 7: Threads - Introduction
// Concept: Create and run threads using Thread class

// Thread 1: Extending Thread class
public class ThreadBasics extends Thread {

    // Variables
    String threadName;

    // Constructor
    public ThreadBasics(String name) {
        threadName = name;
    }

    // run() method - code to execute when thread starts
    @Override
    public void run() {
        System.out.println(threadName + " started");

        // Simulate some work
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Step " + i);

            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println(threadName + " finished");
    }

    public static void main(String[] args) {

        System.out.println(" CREATING THREADS \n");

        // Create thread objects
        ThreadBasics thread1 = new ThreadBasics("Thread-1");
        ThreadBasics thread2 = new ThreadBasics("Thread-2");

        // Start threads (calls run() method internally)
        System.out.println("Starting threads...");
        thread1.start();  // Starts thread1
        thread2.start();  // Starts thread2

        System.out.println("\nMain continues while threads run...\n");
    }
}
