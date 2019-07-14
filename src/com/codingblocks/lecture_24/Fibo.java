package com.codingblocks.lecture_24;

import java.math.BigInteger;

public class Fibo {
    public static void main(String[] args) {

//        BigInteger one = new BigInteger("234443465543");
//        BigInteger two = new BigInteger("234443465543");
//
//        System.out.println(one.add(two));
//        System.out.println(one.subtract(two));
//        System.out.println(one.multiply(two));
//        System.out.println(one.divide(two));
////
////        one.
//
//        BigInteger check = new BigInteger("7865467898076543678908765");
//
//
//        System.out.println(check.isProbablePrime(1));


        int n = 100000;
        BigInteger[] mem = new BigInteger[n+1];

        System.out.println(fiboItr(n, mem));
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int fibo(int n, Integer[] mem){
        if (n < 2){
            return n;
        }

        if (mem[n] != null){
            return mem[n];
        }

        mem[n] =  fibo(n-1, mem) + fibo(n-2, mem);

        return mem[n];
    }

    public static BigInteger fibo(int n, BigInteger[] mem){
        if (n < 2){
            return new BigInteger(Integer.toString(n));
        }

        if (mem[n] != null){
            return mem[n];
        }

        BigInteger f = fibo(n-1, mem);
        BigInteger s = fibo(n-2, mem);

        mem[n] = f.add(s);

        return mem[n];
    }

    public static BigInteger fiboItr(int n, BigInteger[] mem){

        for (int local = 0; local <= n; local++) {
            if (local < 2){
                mem[local] = new BigInteger(Integer.toString(local));
            } else {
                mem[local] = mem[local-1].add(mem[local-2]);
            }
        }

        return mem[n];
    }

}
