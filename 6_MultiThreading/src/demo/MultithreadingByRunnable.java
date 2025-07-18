package demo;



	class MyTask1 implements Runnable {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            try {
	                Thread.sleep(500); // Pause for half a second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	public class MultithreadingByRunnable {
	    public static void main(String[] args) {
	        Runnable task = new MyTask1();

	        Thread thread1 = new Thread(task, "Thread-A");
	        Thread thread2 = new Thread(task, "Thread-B");

	        thread1.start();
	        thread2.start();
	    }
	}

