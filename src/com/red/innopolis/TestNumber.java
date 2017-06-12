package com.red.innopolis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by _red_ on 12.06.17.
 */
public class TestNumber {
    public static volatile List<Integer> listNumber = new ArrayList<>();
    public static volatile Set<Integer> setNumber = new HashSet<>();


    public static synchronized void addToSet(Integer number) {
        if (!setNumber.contains(number)) setNumber.add(number);
    }

    public static synchronized void addToList(Integer number) {
        listNumber.add(number);
    }
}
