package basics.multitheading.synchronization;

public class Synchronization {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        MyThread myThread1 = MyThread.createAndStartThread("mt1", array);
        MyThread myThread2 = MyThread.createAndStartThread("mt2", array);
        MyThread myThread3 = MyThread.createAndStartThread("mt3", array);
        try {
            myThread1.getThread().join();
            myThread2.getThread().join();
            myThread3.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
