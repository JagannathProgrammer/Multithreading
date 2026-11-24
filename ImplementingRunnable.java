class MyThread implements Runnable{
    public void run(){
        System.out.println("Runnable Thread is Running");
    }
}
public class ImplementingRunnable {
     public static void main(String[] args){
        MyThread obj = new MyThread();

        Thread t = new Thread(obj);

        t.start();
    }
}
