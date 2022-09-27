package basics.multitheading.interactionOfThreads;

class InteractionOfThreads {
    public static void main(String[] args) {
        Clock clock = new Clock();
        MyThread mt1 = MyThread.createAndStart("Tick", clock);
        MyThread mt2 = MyThread.createAndStart("Tock", clock);
        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
