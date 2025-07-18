package demo;


class myThread extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() +
                           " with priority: " + Thread.currentThread().getPriority());
    }

    
}

public class PriorityThreads {

	public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        myThread t3 = new myThread();

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }

}
