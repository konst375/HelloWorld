package basics.multitheading.synchronization;

class MyThread implements Runnable {
    Thread thread;
    int[] array;
    SumArray sumArray = new SumArray();
    int answer;

    MyThread(String threadName, int[] array) {
        thread = new Thread(this, threadName);
        this.array = array;
    }

    static synchronized MyThread createAndStartThread(String threadName, int[] array) {
        MyThread myThread = new MyThread(threadName, array);
        myThread.thread.start();
        return myThread;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " launched");
        answer = sumArray.sumArray(array);
        System.out.println("Arrays sum at " + thread.getName() + " is " + answer);
        System.out.println(thread.getName() + " completed");
    }
}
