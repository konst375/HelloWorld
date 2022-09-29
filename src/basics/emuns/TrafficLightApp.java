package basics.emuns;

import static basics.emuns.TrafficLightColor.GREEN;

public class TrafficLightApp {
    public static void main(String[] args) {
        TrafficLightSimulator tls1 = new TrafficLightSimulator(GREEN);
        Thread thread = new Thread(tls1);
        thread.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(tls1.getCurrentColor());
            tls1.waitForChange();
        }
        tls1.cancel();
    }
}
