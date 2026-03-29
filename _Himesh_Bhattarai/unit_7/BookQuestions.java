// Unit 7: Book Questions - Threads Practice
// Concept: Create and manage threads

// Create thread by extending Thread class
class MyThread extends Thread {
    String message;

    public MyThread(String msg) {
        message = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(message + " - Count: " + (i + 1));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread name and ID
class NamedThread extends Thread {
    public NamedThread(String name) {
        super(name);  // Set thread name
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread ID: " + getId());
        System.out.println("Priority: " + getPriority());
    }
}

// Thread priority
class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println(getName() + " (Priority: " + getPriority() + ") is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}

// Check if thread is alive
class LiveThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is executing");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished");
    }
}

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Create threads by extending Thread class
        System.out.println(" QUESTION 1: Create Threads ");

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        // Start threads
        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for t1 to finish
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Q: Get thread name, ID, and priority
        System.out.println(" QUESTION 2: Thread Properties ");

        NamedThread thread1 = new NamedThread("Worker-1");
        NamedThread thread2 = new NamedThread("Worker-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Q: Set thread priority
        System.out.println(" QUESTION 3: Thread Priority ");

        // Priority: MIN_PRIORITY=1, NORM_PRIORITY=5, MAX_PRIORITY=10
        PriorityThread highPriority = new PriorityThread("High-Priority", Thread.MAX_PRIORITY);
        PriorityThread lowPriority = new PriorityThread("Low-Priority", Thread.MIN_PRIORITY);

        highPriority.start();
        lowPriority.start();

        try {
            highPriority.join();
            lowPriority.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Q: Check if thread is alive (isAlive())
        System.out.println("QUESTION 4: Check Thread Status ");

        LiveThread liveThread = new LiveThread();

        System.out.println("Before start - isAlive(): " + liveThread.isAlive());

        liveThread.start();

        System.out.println("After start - isAlive(): " + liveThread.isAlive());

        try {
            Thread.sleep(500);
            System.out.println("During execution - isAlive(): " + liveThread.isAlive());

            liveThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After finish - isAlive(): " + liveThread.isAlive());
    }
}
