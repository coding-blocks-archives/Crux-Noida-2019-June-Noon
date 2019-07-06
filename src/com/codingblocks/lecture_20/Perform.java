package com.codingblocks.lecture_20;

public class Perform {
    public static void main(String[] args) {
        HashTable<Integer, Integer> map = new HashTable<>();

        for (int i = 0; i < 10000000; i++) {
            map.put(i, i);
        }
    }
}
