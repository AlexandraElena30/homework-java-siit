package com.siit.homeworks.homework13;

public class FestivalStatisticsThread implements Runnable {
    private FestivalGate g;

    public FestivalStatisticsThread(FestivalGate g) {
        this.g=g;

    }
    public void run() {

        int c=0;
        while(c<3) {
            try {
                c++;
                Thread.sleep(5000);
                this.g.printTypes();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
