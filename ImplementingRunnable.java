class MyThread implements Runnable{  // Implementing Runnable interface
    public void run(){    // Overriding run() method
        System.out.println("Runnable Thread is Running");
    }
}
public class ImplementingRunnable {   // Main class
     public static void main(String[] args){
        MyThread obj = new MyThread();   // Creating an object of MyThread
        Thread t = new Thread(obj);   // Passing Runnable object to Thread constructor
        t.start();  // Starting a new thread
    }
}
