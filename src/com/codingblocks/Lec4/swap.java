package com.codingblocks.Lec4;

public class swap {

    public static void main(String[] args) {
    int a=7;
    int b=3;
        System.out.println(a +" "+ b);
        swap(a,b);
        System.out.println(a +" "+ b);


    }

    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;

        System.out.println(a + " " + b);
    }





}
