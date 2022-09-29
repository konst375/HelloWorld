package basics.emuns;

import static basics.emuns.TrafficLightColor.*;

class TrafficLightSimulator implements Runnable {
    private TrafficLightColor currentColor;
    private boolean stop = false;
    private boolean changed = false;

    TrafficLightSimulator(TrafficLightColor initialColor) {
        currentColor = initialColor;
    }

    TrafficLightSimulator() {
        currentColor = RED;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(currentColor.getDelay());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (currentColor) {
            case RED -> currentColor = GREEN;
            case YELLOW -> currentColor = RED;
            case GREEN -> currentColor = YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    void cancel() {
        stop = true;
    }
}
