package basics.multitheading;

public class UseThread2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread launched");
        MyThread2 myThread2 = new MyThread2("second thread");
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(10);
        }
        System.out.println("Main thread completed");
    }
}
