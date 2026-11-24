class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Name: " + getName());

        System.out.println("Thread Priority: " + getPriority());
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
