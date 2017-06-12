package com.red.innopolis;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by _red_ on 12.06.17.
 */
public class PutsThread implements Runnable {

    static volatile boolean stopThread = false;
    static Set<Integer> set;
    Random rand = new Random(System.currentTimeMillis());

    public PutsThread() {
        set = new HashSet<>();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                if (stopThread) break;

                Integer test = rand.nextInt(100);
                putValue(test);
                System.out.println(test);
                Thread.sleep(1000);
            }
            GetsThread.stopThread = true;
        } catch (InterruptedException e) {
            System.out.println("Producer is interrupted");
        }
    }


    public synchronized void putValue(int value) {
        set.add(value);
    }

    public synchronized int getSetSize() {
        return set.size();
    }
}
