package basics.multitheading.synchronization;

class SumArray {
    int sumArray;
    synchronized int sumArray(int[] array) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        sumArray = 0;
        for (int arr : array) {
            sumArray += arr;
            System.out.println("Current sum at " + Thread.currentThread().getName() + " is " + sumArray);
        }
        return sumArray;
    }
}
