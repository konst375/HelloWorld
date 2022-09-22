 package basics.multitheading.priority;

class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");
        Priority mt3 = new Priority("Norm priority #1");
        Priority mt4 = new Priority("Norm priority #2");
        Priority mt5 = new Priority("Norm priority #3");

        mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread interrupted");
        }
        System.out.println("High priority thread count: " + mt1.count);
        System.out.println("Low priority thread count: " + mt2.count);
        System.out.println("Norm priority thread #1 count: " + mt3.count);
        System.out.println("Norm priority thread #2 count: " + mt4.count);
        System.out.println("Norm priority thread #3 count: " + mt5.count);
    }
}
