package basics.multitheading.interactionOfThreads;

class MyThread implements Runnable {
    Thread thread;
    Clock clock;

    MyThread(String threadName, Clock clock) {
        thread = new Thread(this, threadName);
        this.clock = clock;
    }

    static MyThread createAndStart(String threadName, Clock ttOb) {
        MyThread myThread = new MyThread(threadName, ttOb);
        myThread.thread.start();
        return myThread;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                clock.tick(true);
            }
            clock.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                clock.tock(true);
            }
            clock.tock(false);
        }
    }
}
