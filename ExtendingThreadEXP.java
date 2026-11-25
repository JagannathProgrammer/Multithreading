
class MyThread extends Thread{   // Creating a class by extending Thread
    public void run(){    // Overriding the run() method
        System.out.println("Thread is Running");   // Printing a message
    }
}
public class ExtendingThreadEXP {
    public static void main(String[] args){
        MyThread t = new MyThread();    // Creating an object of MyThread
        t.start();    // Starting a new thread
    }
}