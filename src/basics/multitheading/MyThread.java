package basics.multitheading;

public class MyThread implements Runnable {
    private final Thread thrd;

    private MyThread(String threadName) {
        thrd = new Thread(this , threadName);
    }

    public static void createAndStart(String threadName) {
        MyThread newThread = new MyThread(threadName);
        newThread.thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + "thread launched");
        for (int i = 0; i < 10; i++) {
            System.out.println("At " + thrd.getName() + " counter " + i);
            System.out.println("Thread completed");
        }
    }
}
