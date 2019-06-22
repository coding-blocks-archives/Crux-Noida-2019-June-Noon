package com.codingblocks.lect10;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {
        int ar[] = {5, 4, 9, 2, 1, 0};
        System.out.println(Arrays.toString(mergesort(ar)));


    }

    public static int[] mergesort(int[] ar) {

        if (ar.length == 1) {
            return ar;
        }


        int mid = ar.length / 2;

        int first[] = mergesort(Arrays.copyOfRange(ar, 0, mid));
        int second[] = mergesort(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                k++;
            } else {
                mix[k] = second[j];
                j++;
                k++;
            }
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
