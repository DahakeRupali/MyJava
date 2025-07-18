package demo;

// MyRunnable class implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface!");
    }
}

// BasicRunnable class (Main class)
public class BasicRunnable {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyRunnable());  // Create thread and pass MyRunnable
        t1.start();  // Start the thread
    }
}

