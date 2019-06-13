package com.codingblocks.Lec7;

public class recursioneg {
    public static void main(String[] args) {
        int n=3;
      printinc(n);
        System.out.println(fact(3));
        System.out.println(fibo(5));
    }

    public static void printdec(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }

    public static void printinc(int n){

        if(n==0){
            return;
        }

        printinc(n-1);
        System.out.println(n);
    }

    public static int fact(int n){

        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }


}
