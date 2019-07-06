package com.codingblocks.lecture_20;

import java.util.HashMap;
import java.util.Map;

public class FreqMap {
    public static void main(String[] args) {


        String line = "hello world";

        Map<Character, Integer> map = freMap(line);

        System.out.println(map);
    }

    private static Map<Character, Integer> freMap(String line) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : line.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }
}
