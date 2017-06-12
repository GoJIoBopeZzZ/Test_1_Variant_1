package com.red.innopolis;
/**
 * Created by _red_ on 12.06.17.
 */
public class GetsThread implements Runnable {

    public static volatile boolean stopThread = false;

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

    public GetsThread(PutsThread gen) {
        this.gen = gen;
    }
}
