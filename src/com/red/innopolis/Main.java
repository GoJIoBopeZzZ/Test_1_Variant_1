package com.red.innopolis;


import com.red.innopolis.ProduserConsumerPackage.Consumer;
import com.red.innopolis.ProduserConsumerPackage.Producer;
import com.red.innopolis.ProduserConsumerPackage.Resource;

public class Main {

    public static void main(String[] args) {
//        PutsThread generator = new PutsThread();
//        Thread puter = new Thread(generator);
//        Thread geter = new Thread(new GetsThread(generator));
//
//        geter.start();
//        generator.run();
//        puter.start();
//
//        try {
//            geter.join();
//            puter.join();
//        } catch (InterruptedException e) {
//            System.out.println("Все потоки остановлены");
//        }

        Resource res = new Resource();
        Producer prod2 = new Producer(res , 50);
        Producer prod = new Producer(res , 50);
        Consumer con = new Consumer(res , 200);
        Consumer con1 = new Consumer(res , 200);
        Consumer con2 = new Consumer(res , 200);
        Consumer con3 = new Consumer(res , 300);

        prod.start();
        prod2.start();
        con.start();
        con1.start();
        con2.start();
        con3.start();
    }

}