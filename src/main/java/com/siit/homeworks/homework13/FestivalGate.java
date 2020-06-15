package com.siit.homeworks.homework13;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class FestivalGate {

    private BlockingQueue<TicketType> queue;

    public FestivalGate(int size) {
        this.queue = new ArrayBlockingQueue<TicketType>(size);
    }
    public void add(TicketType t) {
        this.queue.add(t);
    }

    public synchronized void printTypes() { //synchronized
        System.out.println(queue.size() + " people entered.");
        Iterator iteratorValues = queue.iterator();
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
        TicketType t;
        while (iteratorValues.hasNext()) {
            t=(TicketType)iteratorValues.next();
            if(t==TicketType.FULL)
                t1++;
            else if(t==TicketType.FREE_PASS)
                t2++;
            else if(t==TicketType.FULL_VIP)
                t3++;
            else if(t==TicketType.ONE_DAY)
                t4++;
            else if(t==TicketType.ONE_DAY_VIP)
                t5++;
        }
        System.out.println(t1+ " people have full tickets");
        System.out.println(t2+ " people have free passes");
        System.out.println(t3+ " people have full VIP passes");
        System.out.println(t4+ " people have one day passes");
        System.out.println(t5+ " people have one day VIP passes");
    }

    public static void main(String[] args) {

        int ticketNumber = 100 + (int) (Math.random() * 100);
        FestivalGate g = new FestivalGate(ticketNumber);

        FestivalStatisticsThread stats=new FestivalStatisticsThread(g);
        Thread statsThread = new Thread(stats);
        statsThread.start();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(ticketNumber);

        for (int i = 0; i < ticketNumber; i++) {

            Runnable worker = new FestivalAttendeeThread(TicketType.getRandom(),g);
            executor.execute(worker);
        }
        executor.shutdown();
        // Wait until all threads are finish
        while (!executor.isTerminated()) {

        }
        System.out.println("\nFinished all threads");



    }


}
