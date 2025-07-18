package demo;


//First Class
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread is running using Thread class!");
 }
}

//Second Class
public class Basic {
 public static void main(String args[]) {
     MyThread t1 = new MyThread();
     t1.start();  // Create thread and start() will internally call run()
 }
}



