
class MyThread extends Thread
{
    public void run()
    {
        // Get the currently executing thread
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        // Print thread name
        System.out.println("Thread Name: " + getName());

        // Print thread priority
        System.out.println("Thread Priority: " + getPriority());

        // Check whether thread is interrupted
        System.out.println("Interrupted Status: " + isInterrupted());

        // Sleep method
        try
        {
            for(int i = 1; i <= 3; i++)
            {
                System.out.println(getName() + " : " + i);

                // Pause thread for 500 milliseconds
                Thread.sleep(5000);

                // Yield method
                Thread.yield();
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(getName() + " was interrupted");
        }
    }
}

public class ThreadAllMethodsEXP
{
    public static void main(String[] args)
    {
        // Creating thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // setName() - Change thread names
        t1.setName("Java Thread");
        t2.setName("Python Thread");

        // getName() - Get thread names
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());

        // setPriority() - Set thread priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // getPriority() - Get thread priorities
        System.out.println("Priority 1: " + t1.getPriority());
        System.out.println("Priority 2: " + t2.getPriority());

        // currentThread() - Get main thread
        System.out.println("Main Thread: " +
        Thread.currentThread().getName());

        // isAlive() - Check thread status before starting
        System.out.println("Before Start: " + t1.isAlive());

        // start() - Start threads
        t1.start();
        t2.start();

        // isAlive() - Check thread status after starting
        System.out.println("After Start: " + t1.isAlive());

        // join() - Wait for t1 and t2 to finish
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }

        // interrupt() - Interrupt a thread
        // Demonstration is shown separately below.

        // isAlive() - Check after completion
        System.out.println("After Completion: " + t1.isAlive());

        System.out.println("Main Thread Completed");
    }
}

