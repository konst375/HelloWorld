package basics.emuns;

enum TrafficLightColor {
    RED(6), GREEN(4), YELLOW(2);

    private final int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    int getDelay() {
        return delay;
    }
}
