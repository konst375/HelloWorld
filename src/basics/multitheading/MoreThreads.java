package basics.multitheading;

class MoreThreads {
    public static void main(String[] args) {
        MyThread myThread1 = MyThread.createAndStart("thread 1");
        MyThread myThread2 = MyThread.createAndStart("thread 2");
        MyThread myThread3 = MyThread.createAndStart("thread 3");
        
        try {
            myThread1.getThread().join();
            System.out.println("thread1 joined");
            myThread2.getThread().join();
            System.out.println("thread2 joined");
            myThread3.getThread().join();
            System.out.println("thread3 joined");
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted, message: " + e.getMessage());
        }

        System.out.println("Main thread completed");
    }
}
