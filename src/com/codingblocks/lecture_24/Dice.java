package com.codingblocks.lecture_24;


import java.math.BigInteger;

public class Dice {
    public static void main(String[] args) {

        int target = 100000;

        BigInteger[] mem = new BigInteger[target + 1];
        System.out.println(diceItr(target, 3, mem));
    }

    public static int dice(int target, int face){
        if (target == 0){
            return 1;
        }

        int acc = 0;

        for (int i = 1; i <= face && i <= target; i++) {
            acc += dice(target-i, face);
        }

        return acc;
    }

    public static int dice(int target, int face, Integer[] mem){
        if (target == 0){
            return 1;
        }

        if(mem[target] != null){
            return mem[target];
        }

        int acc = 0;

        for (int i = 1; i <= face && i <= target; i++) {
            acc += dice(target-i, face, mem);
        }

        mem[target] = acc;

        return acc;
    }

    public static BigInteger dice(int target, int face, BigInteger[] mem){
        if (target == 0){
            return BigInteger.ONE;
        }

        if(mem[target] != null){
            return mem[target];
        }

        BigInteger acc = BigInteger.ZERO;

        for (int i = 1; i <= face && i <= target; i++) {
            acc = acc.add(dice(target-i, face, mem));
        }

        mem[target] = acc;

        return acc;
    }

    public static BigInteger diceItr(int target, int face, BigInteger[] mem){

        for (int t = 0; t <= target ; t++) {

            if (t == 0){
                mem[t] = BigInteger.ONE;
            } else {
                BigInteger acc = BigInteger.ZERO;

                for (int i = 1; i <= face && i <= t; i++) {
                    acc = acc.add(mem[t-i]);
                }
                mem[t] = acc;
            }
        }

        return mem[target];
    }
}
