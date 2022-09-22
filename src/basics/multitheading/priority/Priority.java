package basics.multitheading.priority;

class Priority implements Runnable{
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " launch");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (!stop && count < 100);
        stop = true;
        System.out.println(thread.getName() + " - interrupting.");
    }
}
