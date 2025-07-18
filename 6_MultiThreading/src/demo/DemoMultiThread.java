package demo;

public class DemoMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        MyTask task1 = new MyTask();
		        task1.setName("Custom-Thread-1"); // Set custom name for task1
		        task1.start(); // Start first thread
		        
		        
		        MyTask task2 = new MyTask();
		        task2.setName("Custom-Thread-2"); // Set custom name for task1
		        task2.start(); // Start second thread
		    }

	}



class MyTask extends Thread {
	private volatile boolean running = true; // Flag to control execution
    public void run() {
    	
        for (int i = 1; i <= 5; i++) {
            
            try 
            {
                Thread.sleep(500); // Pause for 500ms
                System.out.println(Thread.currentThread().getName() + " is running - Step " + i);
            } 
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        
        
    }
    
    public void stopThread()
    { // Method to stop thread safely
        running = false;
        
    }
}

