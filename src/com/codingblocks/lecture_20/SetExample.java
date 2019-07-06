package com.codingblocks.lecture_20;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        long start = new Date().getTime();
        for (int i = 0; i < 10000000; i++) {
            set.add(i);
        }
        long end = new Date().getTime();

        System.out.println(end-start);
    }
}
