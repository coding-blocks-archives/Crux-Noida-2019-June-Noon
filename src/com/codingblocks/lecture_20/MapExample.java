package com.codingblocks.lecture_20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        MapArrayList<String, String> map = new MapArrayList<>();

        map.put("apple", "A sweet red fruit");
        map.put("mango", "King of fruits");


        System.out.println(map.get("apple"));
//        System.out.println(map.toString());

        map.put("apple", "aage se apple na lana");

        System.out.println(map.get("apple"));

        map.remove("apple");

        System.out.println(map.get("apple"));


//        Human[] humans = new Human[2];
//        humans[0] = new Human("Mohit", 32);
//        humans[1] = new Human("Ravan", 12);
//
//        System.out.println(Arrays.toString(humans));
//
//        System.out.println(map.hashCode());
//        System.out.println("mohit".hashCode());
//        System.out.println(System.out.hashCode());
//
//        Character one = 'a';
//        System.out.println(one.hashCode());
    }
}
