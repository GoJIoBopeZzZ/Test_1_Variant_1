package com.red.innopolis.ProduserConsumerPackage;

import java.util.*;

/**
 * Created by _red_ on 12.06.17.
 */
public class Resource {
//    private List<Integer> number;
    private Set<Integer> number;
    private Integer count;

    public Resource() {
        number = new HashSet<>();
        count = 0;
    }

//    public synchronized Integer getAndRemoveResource() {
//        int number = this.number.get(0);
//        System.out.println("\nTry to remove - " + number);
//        this.number.remove(0);
//        count--;
//        return number;
//    }

    public synchronized void produce(Integer number) {
        this.number.add(number);
        count++;
    }

    public synchronized Integer getSize() {
        return number.size();
    }

//    public synchronized Integer get() {
//        if (!this.number.isEmpty())
//            return this.number.get(0);
//        else return null;
//    }

    public synchronized void printList() {
        System.out.println(number);
//        for (Integer i : number) {
//            System.out.print(i + " ");
//        }
    }

    //    public static volatile List<Integer> listNumber = new ArrayList<>();
//    public static volatile Set<Integer> setNumber = new HashSet<>();
//
//    public static synchronized void addToSet(Integer number) {
//        if (!setNumber.contains(number)) setNumber.add(number);
//    }
//
//    public static synchronized void addToList(Integer number) {
//        listNumber.add(number);
//    }
}
