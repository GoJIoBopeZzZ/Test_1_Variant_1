package com.red.innopolis.OldRealization;
/**
 * Created by _red_ on 12.06.17.
 */
public class GetsThread implements Runnable {

    static volatile boolean stopThread = false;

    private PutsThread gen;

    @Override
    public void run() {
        try {
            while (!stopThread) {
                Thread.sleep(5000);
                int distinct = gen.getSetSize();
                System.out.println("Uniq: " + distinct);

                if (stopThread) {
                    PutsThread.stopThread = true;
                    break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer is interrupted");
        }
    }

    GetsThread(PutsThread gen) {
        this.gen = gen;
    }
}
