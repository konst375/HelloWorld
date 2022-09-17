package basics.multitheading;

public class MyThread2 extends Thread{

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "thread launched");
        for (int i = 0; i < 10; i++) {
            System.out.println("At " + getName() + " counter " + i);
        }
        System.out.println("Thread completed");
    }
}
