package org.arthur.enums;

/**
 * Created by adobrya on 9/25/2017.
 */
public enum Status {
    ONLINE(0),BUSY(5000),AWAY(10000),OFFLINE(15000);

    private int delay;

    Status(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
