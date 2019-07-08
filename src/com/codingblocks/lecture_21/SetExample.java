package com.codingblocks.lecture_21;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        int[] items = {1, 1, 0, 0, 1, 2, 1, 0};
        int[] nums = {1, 3, 0, 0, 3, 2, 1, 0};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < items.length; i++) {
            set.remove(items[i]);
        }



        System.out.println(set);

    }
}
