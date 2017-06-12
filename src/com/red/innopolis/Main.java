package com.red.innopolis;


public class Main {

    public static void main(String[] args) {
        PutsThread generator = new PutsThread();
        Thread puter = new Thread(generator);
        Thread geter = new Thread(new GetsThread(generator));

        geter.start();
//        generator.run();
        puter.start();

        try {
            geter.join();
            puter.join();
        } catch (InterruptedException e) {
            System.out.println("Все потоки остановлены");
        }
    }
}