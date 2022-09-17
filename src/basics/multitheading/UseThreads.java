package basics.multitheading;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread launched");
        MyThread.createAndStart("secondThread");

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("Main thread completed");
    }
}