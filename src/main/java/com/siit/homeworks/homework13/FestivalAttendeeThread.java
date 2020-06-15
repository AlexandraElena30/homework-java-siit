package com.siit.homeworks.homework13;

enum TicketType {
    FULL,
    FULL_VIP,
    FREE_PASS,
    ONE_DAY,
    ONE_DAY_VIP;

    public static TicketType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}

public class FestivalAttendeeThread implements Runnable {

    private TicketType t;
    private FestivalGate g;

    public FestivalAttendeeThread(TicketType t, FestivalGate g) {
        this.t = t;
        this.g = g;

    }

    @Override
    public void run() {

        try {
            int r = (int) (Math.random() * 12);
            Thread.sleep(r * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.g.add(this.t);

    }
}
