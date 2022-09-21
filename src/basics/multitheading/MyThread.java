package basics.multitheading;

public class MyThread implements Runnable {
    private final Thread thread;

    private MyThread(String threadName) {
        thread = new Thread(this, threadName);
    }

    public static MyThread createAndStart(String threadName) {
        MyThread newThread = new MyThread(threadName);
        newThread.thread.start();
        return newThread;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + "thread " + thread.getName() + " launched");
        for (int i = 0; i < 10; i++) {
            System.out.println("At " + thread.getName() + " counter " + i);
        }
        System.out.println(thread.getName() + "completed");
    }
}
